
    @extends('layouts.femaster')

    @section('content')
        <h2>Hello World, estamos nas Views.</h2>
        @auth
            <h3> Olá, {{Auth::user()->name}}</h3>
        @endauth

        <h5>Tens disponíveis estes links:</h5>

        <ul>
            <li><a href="{{route('bemvindos')}}">Vai para casa!</a></li>
            <li><a href="{{route('users.add')}}">Aqui podes adicionar utilizadores</a></li>
            <li><a href="{{route('users.all')}}">Aqui podes ver todos os users</a></li>
            <li><a href="{{route('tasks.add')}}">Aqui podes adicionar tarefas</a></li>
            <li><a href="{{route('tasks.all')}}">Todas as tarefas</a></li>
        </ul>

        <h3>Dados do Cesae</h3>
        <p>Nome: {{$cesaeInfo['name']}}</p>
        <p>Morada: {{$cesaeInfo['address']}}</p>
        <p>Email: {{$cesaeInfo['email']}}</p>
    @endsection

    @section('content2')
        <p>segundo conteudo</p>
    @endsection

