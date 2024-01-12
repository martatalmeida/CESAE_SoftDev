
    @extends('layouts.femaster')

    @section('content')
        <h2>Hello World, estamos nas Views.</h2>

        <h5>Tens disponíveis estes links:</h5>

        <ul>
            <li><a href="{{route('bemvindos')}}">Vai para casa!</a></li>
            <li><a href="{{route('users.add')}}">Aqui podes adicionar utilizadores</a></li>
            <li><a href="{{route('users.all')}}">Aqui podes ver todos os users</a></li>
        </ul>
    @endsection

    @section('content2')
        <p>segundo conteudo</p>
    @endsection

