<?php

namespace App\Http\Controllers;

use id;
use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;


class UserController extends Controller
{
    public function addUser(){
        /* DB::table('users')
        ->UpdateOrInsert(
            [
                'email'=>'martatalmeida@gmail.com',
            ],
            [
            'name'=> 'Marta',
            'password'=> 'marta123',
            'updated_at'=> now(),
            'created_at'=> now()
        ]);

        $users = DB::table('users')
        ->get();

        $myUser = DB::table('users')
        ->where('email','martatalmeida@gmail.com')
        ->first(); */

        return view('users.add_user');
    }

    public function createUser(Request $request){

        $request->validate([
            'email' => 'required|unique:users',
            'name' => 'required|string|max:15',
        ]);

        User::insert([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password)
        ]);

        return redirect()->route('users.all')->with('message', 'Boa, estamos a caminho de ter uma super app com utilizadores adicionados!');
    }

    public function updateUser(Request $request){


         $request->validate([
            'phone' => 'min:9'
        ]);

        User::where('id', $request->id)
        ->update([
            'name' => $request->name,
            'address' => $request->address,
            'phone' => $request->phone
        ]);

        return redirect()->route('users.all')->with('message', 'Utilizador atualizado!');
    }


    public function allUsers(){
    $hello= 'Finalmente vamos para código';
    $helloAgain = 'cucu';

    $daysOfWeek = $this->getWeekDays();
    $info = $this->info();
    $users = $this->getContacts();

    $search = request()->query('search') ? request()->query('search') : null;


    $users = DB::table('users');

    if($search) {
        $users = $users
        ->where('name','like', "%{$search}")
        ->orWhere('email', 'like', "%{search}%");
    }

    $users = $users->get();

    return view('users.all_users', compact(
        'hello',
        'helloAgain',
        'daysOfWeek',
        'info',
        'users'
    ));
    }

    public function viewUser($id){

        $myUser = User::where('id', $id)->first();

        return view('users.view', compact('myUser'));
    }

    public function deleteUser($id){

        Task::where('user_id', $id)->delete();

        User::where('id', $id)->delete();

        return back();

    }

    private function getWeekDays(){
        return ['Segunda', 'Terça', 'Quarta', 'Quinta'];
    }

    private function  info(){
        $courseInfo = [
        'name' => 'Software Developer',
        'year' => 2024,
        'modules' => ['PHP', 'WebServices','Java'],
        ['Teste', 4, 'Sofia', 'João']
        ];

        return $courseInfo;
    }

    private function getContacts(){

        /* $contacts = [
            ['id' => 1, 'name' => 'Sara', 'phone' => '985654455', 'email' => 'sara@gmail.com'],
            ['id' => 2, 'name' => 'Bruno', 'phone' => '985654455', 'email' => 'bruno@gmail.com'],
            ['id' => 3, 'name' => 'Marcia', 'phone' => '985654455', 'email' => 'marcia@gmail.com']
        ]; */

        $users = DB::table('users')
        //->whereNull('updated_at')
        ->get();

        /* $users = User::get(); */

        $adminType = User::TYPE_ADMIN;

        return $users;

    }

}
