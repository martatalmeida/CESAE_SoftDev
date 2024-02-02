@extends('layouts.femaster')

@section('content')

<h1>Ver / Atualizar tarefa {{$myTask->name}}</h1>

<form method="POST" action="{{route('users.update')}}">
    @csrf
    <input type="hidden" name="id" value={{$myTask->id}}>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Nome</label>
        <input type="texto" value= "{{ $myTask->name }}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
        @error("name")
            <div class="alert alert-danger">
                O nome que colocou é inválido.
            </div>
        @enderror
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Descricao</label>
        <input type="texto" value= "{{ $myTask->description }}" name="address" class="form-control" id="exampleFormControlInput1">
        @error("description")
            <div class="alert alert-danger">
                A descriçao que colocou é inválida.
            </div>
        @enderror
      </div>
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
       <br>
      <button type="submit" class="btn btn-primary">Atualizar</button>
</form>

@endsection

