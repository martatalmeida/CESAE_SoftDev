@extends('layouts.femaster')

@section('content')

<h1>Ver um user</h1>


<h4>Nome: {{$myUser->name}}</h4>
<h4>Phone: {{$myUser->phone}}</h4>
<h4>Address: {{$myUser->address}}</h4>
<h4>Email: {{$myUser->email}}</h4>
<h4>Password: {{$myUser->password}}</h4>

@endsection
