<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

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
    ->select('tasks.id','tasks.name','tasks.status','tasks.due_at','users.name AS PessoaResponsavel')
    ->join('users','users.id','=','tasks.user_id')
    ->get();

    return $tasks;
}

public function viewTask($id){

    $myTask = Task::where('tasks.id', $id)
    ->join('users','users.id','=','tasks.user_id')
    ->select('tasks.*', 'users.name AS PessoaResponsavel')
    ->first();

    $users= DB::table('users')->get();

    return view('tasks.view_task', compact('myTask', 'users'));
}

public function deleteTask($id){


    Task::where('id', $id)->delete();

    return back();

}

 public function addTask(){

    $users = DB::table('users')->get();

    return view('tasks.add_task', compact('users'));
}

public function createTask(Request $request){

    $request->validate([
        'name' => 'required|string|max:50',
        'description' => 'required|string|max:200',
        'user_id' => 'required|integer|exists:users, id'
    ]);

    Task::insert([
        'name' => $request->name,
        'description' => $request->description,
        'user_id' => $request->user_id,
    ]);

    return redirect()->route('tasks.all')->with('message', 'Tarefa adicionada com sucesso"');
}

public function updateTask(Request $request){

    $request->validate([
        'name' => 'required|string|max:50',
        'description' => 'required|string|max:200',
        'user_id' => 'required|integer|exists:users, id'
    ]);

    Task::where('id', $request->id)
    ->update([
        'name' => $request->name,
        'description' => $request->description,
        'user_id' => $request->user_id,
    ]);

    return redirect()->route('tasks.all')->with('message', 'Tarefa atualizada!');
}

}
