<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/home', [IndexController::class, 'index'])->name('home.index');

Route::get('/hello', function () {
    return '<h1>Hello Turma de SoftDev</h1>';
})->name('home.hello');

Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello Turma de SoftDev</h1>'.$nome;
});

Route::get('/users/add', [UserController::class, 'addUser'])->name('users.add');

Route::get('/users/all', [UserController::class, 'allUsers'])->name('users.all');


Route::fallback(function(){
    return view('main.fallback');
});
