<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class UserController extends Controller
{
    public function addUser(){
        DB::table('users')
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
        ->first();

        return view('users.add_user');
    }

    public function allUsers(){
    $hello= 'Finalmente vamos para código';
    $helloAgain = 'cucu';

    $daysOfWeek = $this->getWeekDays();
    $info = $this->info();
    $users = $this->getContacts();

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

    public function deleteUser(){

        User::where('id', $id)->delete();

        return back;
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
