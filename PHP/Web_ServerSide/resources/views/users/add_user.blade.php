@extends('layouts.femaster')

@section('content')


<br>
    <h2>Olá, aqui podes Adicionar Utilizadores</h2>
    <br>

    <form method="POST" action="{{route('users.create')}}">
        @csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value= "{{ old('name') }}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
            @error("name")
                <div class="alert alert-danger">
                    O nome que colocou é inválido.
                </div>
            @enderror
          </div>
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input type="email" value="{{ old('email') }}" name="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
            @error('email')
                <div class="alert alert-danger">
                    O email que colocou já está registado.
                </div>
            @enderror
          </div>
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Password</label>
            <input type="password" value="" name="password" class="form-control" id="exampleFormControlInput1" placeholder="Password" required>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>
    <br>
    <br>

    </div>
@endsection
