@extends('layouts.femaster')

@section('content')

<h1>Ver / Atualizar dados {{$myUser->name}}</h1>

<form method="POST" action="{{route('users.update')}}">
    @csrf
    <input type="hidden" name="id" value = {{$myUser->id }}>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Nome</label>
        <input type="texto" value= "{{ $myUser->name }}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
        @error("name")
            <div class="alert alert-danger">
                O nome que colocou é inválido.
            </div>
        @enderror
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Email</label>
        <input disabled type="email" value="{{ $myUser->email }}" name="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
        @error('email')
            <div class="alert alert-danger">
                O email que colocou já está registado.
            </div>
        @enderror
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Morada</label>
        <input type="texto" value= "{{ $myUser->address }}" name="address" class="form-control" id="exampleFormControlInput1">
        @error("address")
            <div class="alert alert-danger">
                A morada que colocou é inválida.
            </div>
        @enderror
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Telefone</label>
        <input type="texto" value= "{{ $myUser->phone }}" name="phone" class="form-control" id="exampleFormControlInput1">
        @error("phone")
            <div class="alert alert-danger">
                O telefone que colocou é inválido.
            </div>
        @enderror
      </div>
      <button type="submit" class="btn btn-primary">Atualizar</button>
</form>

@endsection
