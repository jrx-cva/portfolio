import 'dart:ui';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';

import 'pantalla.dart';
import 'cabecera.dart';
import 'biografia.dart';
import 'LineaFollowing.dart';
import 'stories.dart';
import 'iconosPublicaciones.dart';
import 'publicaciones.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Final Layout',
      home: NuevoScaffold(),
    );
  }
}

class NuevoScaffold extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
          backgroundColor: Colors.white,

          title:
              //icono nombre icono
          Row(mainAxisAlignment: MainAxisAlignment.spaceBetween, children: [
            Icon(Icons.arrow_back_ios_sharp, color: Colors.black),
            Text("greenhousejuice ☑️", style: TextStyle(color: Colors.black)),
            Icon(Icons.more_horiz, color: Colors.black)
          ])),

      endDrawer: Pantalla(),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Cabecera(),
          Biografia(),
          LineaFollowing(),
          Stories(),
          iconosPublicaciones(),
          Publicaciones()
        ],),);
  }
}




