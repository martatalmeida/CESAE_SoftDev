@extends('layouts.femaster')
@section('content')
    <h3>Olá, aqui estão todos os users</h3>

    {{-- <p>{{$hello}}</p>
    <p>{{$helloAgain}}</p>
    <p>{{$daysOfWeek[2]}}</p>
    <p>{{$info['name']}}</p>
    <p>{{$info['modules'][0]}}</p>
    <p>{{$info[0][2]}}</p> --}}

    <table class="table">
        <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Phone</th>
          <th scope="col">Email</th>
          <th></th>
        </tr>
        </thead>
        <tbody>
        @foreach ($users as $user)
          <tr>
            <td scope="row">{{$user->id}}</th>
            <td>{{$user->name}}</td>
            <td>{{$user->phone}}</td>
            <td>{{$user->email}}</td>
            <td><a href="{{route('users.view', $user->id)}}" class="btn btn-info">Ver</a></td>
          </tr>
        @endforeach
        </tbody>
    </table>




@endsection
