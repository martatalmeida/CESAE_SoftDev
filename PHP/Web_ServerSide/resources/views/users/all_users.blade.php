@extends('layouts.femaster')
@section('content')
    <h3>Olá, aqui estão todos os users</h3>

    <p>{{$hello}}</p>
    <p>{{$helloAgain}}</p>
    <p>{{$daysOfWeek[2]}}</p>
    <p>{{$info['name']}}</p>
    <p>{{$info['modules'][0]}}</p>
    <p>{{$info[0][2]}}</p>
@endsection
