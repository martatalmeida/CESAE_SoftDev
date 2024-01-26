<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function allTasks(){

        $tasks = $this->getAllTasks();


        return view('tasks.all_tasks', compact(
            'tasks'
        ));
    }

public function getAllTasks(){

    $tasks = DB::table('tasks')
    ->select('tasks.name','tasks.status','tasks.due_at','users.name AS PessoaResponsavel')
    ->join('users','users.id','=','tasks.user_id')
    ->get();

    return $tasks;
}

}
