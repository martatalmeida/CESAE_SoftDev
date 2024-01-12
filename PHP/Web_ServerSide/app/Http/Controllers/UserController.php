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

    //dd($info);
    //var_dump($info);

    return view('users.all_users', compact(
        'hello',
        'helloAgain',
        'daysOfWeek',
        'info'
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

}
