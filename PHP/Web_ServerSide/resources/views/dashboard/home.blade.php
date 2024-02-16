@extends('layouts.femaster')

@section('content')

<h1>Olá,
    @auth
        {{ Auth::user()->name }}
    @endauth estás no Back Office.
</h1>

@auth
@if($message)
    <div class="alert alert-info" role="alert">
        <h6>Conta de Administrador</h6>
    </div>
@endif
@endauth

@endsection
