@extends('layouts.femaster')

@section('content')

    <h2>Todas as Tarefas</h2>

    @if (session('message'))
    <div class="alert alert-success">
        {{session('message')}}
    </div>
    @endif

    <table class="table">
        <thead>
        <tr>
          <th scope="col">Name</th>
          <th scope="col">Status</th>
          <th scope="col">Data Conclusão</th>
          <th scope="col">Pessoa Responsável</th>
          <th></th>
          <th></th>
        </tr>
        </thead>
        <tbody>
        @foreach ($tasks as $task)
          <tr>
            <td scope="row">{{$task->name}}</th>
            <td>{{$task->status}}</td>
            <td>{{$task->due_at}}</td>
            <td>{{$task->PessoaResponsavel}}</td>
            <td><a href="{{route('tasks.view_task', $task->id)}}" class="btn btn-info">Ver</a></td>
            <td><a href="{{route('tasks.delete', $task->id)}}" class="btn btn-danger">Delete</a></td>
          </tr>
        @endforeach
        </tbody>
    </table>

@endsection
