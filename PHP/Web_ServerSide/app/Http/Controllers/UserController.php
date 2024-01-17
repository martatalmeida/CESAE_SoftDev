<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function addUser(){
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

        $contacts = [
            ['id' => 1, 'name' => 'Sara', 'phone' => '985654455', 'email' => 'sara@gmail.com'],
            ['id' => 2, 'name' => 'Bruno', 'phone' => '985654455', 'email' => 'bruno@gmail.com'],
            ['id' => 3, 'name' => 'Marcia', 'phone' => '985654455', 'email' => 'marcia@gmail.com']
        ];

        return $contacts;

    }

}
