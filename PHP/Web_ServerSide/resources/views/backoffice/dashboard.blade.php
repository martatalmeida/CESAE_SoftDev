@if(Auth::user()->user_type == 1)
    <!-- Alerta -->
    <div class="alert alert-info" role="alert">
        Conta de Administrador
    </div>
    @endif

<h1>Olá, {{ Auth::user()->name }}</h1>

