@extends('layouts.femaster')

@section('content')

    <h2>Todas as Tarefas</h2>


    <table class="table">
        <thead>
        <tr>
          <th scope="col">Name</th>
          <th scope="col">Status</th>
          <th scope="col">Data Conclusão</th>
          <th scope="col">Pessoa Responsável</th>
        </tr>
        </thead>
        <tbody>
        @foreach ($tasks as $task)
          <tr>
            <td scope="row">{{$task->name}}</th>
            <td>{{$task->status}}</td>
            <td>{{$task->due_at}}</td>
            <td>{{$task->PessoaResponsavel}}</td>
          </tr>
        @endforeach
        </tbody>
    </table>

@endsection
