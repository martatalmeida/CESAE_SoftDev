<?php

use Illuminate\Support\Facades\Route;

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
});

Route::get('/hello', function () {
    return '<h1>Hello Turma de SoftDev</h1>';
})->name('home.hello');

Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello Turma de SoftDev</h1>'.$nome;
});
