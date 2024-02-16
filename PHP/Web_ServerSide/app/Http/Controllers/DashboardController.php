<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{

    public function __constructor() {

        $this->middleware(['auth']);

    }

    public function index() {

        $isAdmin = Auth::user()->user_type == User::TYPE_ADMIN ? true : false;

        if($isAdmin){
        $message = 'olá, és administrador';
        }

        return view('dashboard.home', compact('message'));
    }
}
