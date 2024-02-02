@extends('layouts.femaster')

@section('content')


<br>
    <h2>Olá, aqui podes Adicionar Tarefas</h2>
    <br>

    <form method="POST" action="{{route('tasks.create')}}">
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
            <label for="exampleFormControlInput1" class="form-label">Descricao</label>
            <input type="texto" value= "{{ old('description') }}" name="description" class="form-control" placeholder="Descricao" id="exampleFormControlInput1">
            @error("description")
                <div class="alert alert-danger">
                    A descriçao que colocou é inválida.
                </div>
            @enderror
          </div>
          <div class="mb-3">
          <form method="GET">
            <select class="custom-select" name="user_id">
                <option value="" selected>Todos os Utilizadores</option>

                @foreach($users as $item)
                <option @if($item->id == request()->query('user_id'))
                    selected @endif value="{{ $item ->id }}">
                        {{ $item->name}} </option>
                @endforeach
            </select>
           </form>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>
    <br>


@endsection
