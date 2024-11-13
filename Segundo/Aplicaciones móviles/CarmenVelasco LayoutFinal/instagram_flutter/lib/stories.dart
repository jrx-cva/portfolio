import 'dart:ui';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';


class Stories extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Flexible(
        child: ListView(
            shrinkWrap: true,
            scrollDirection: Axis.horizontal,
            children: [
              //imagenes
              ContenedorS("https://scontent-mad1-1.cdninstagram.com/v/t51.2885-15/s150x150/130582812_150137726484708_2422317924755294986_n.jpg?_nc_ht=scontent-mad1-1.cdninstagram.com&_nc_ohc=d66VrnoI8ywAX_b4F9j&tp=1&oh=3a598d07b91116361abdc1d65ac66bff&oe=5FFE802B","Job Fair"),
              ContenedorS("https://scontent-mad1-1.cdninstagram.com/v/t51.2885-15/s150x150/123138842_394485008589151_501246061295591546_n.jpg?_nc_ht=scontent-mad1-1.cdninstagram.com&_nc_ohc=TFBZhbrtTvYAX8Nq1J8&tp=1&oh=f3425a6bbc1ef066a021a6da4f564750&oe=5FFEB318", "Field Notes"),
              ContenedorS("https://scontent-mad1-1.cdninstagram.com/v/t51.2885-15/s150x150/126895460_742041040000204_8889828069114132526_n.jpg?_nc_ht=scontent-mad1-1.cdninstagram.com&_nc_ohc=8K_4sdeKNyoAX9Bvlby&tp=1&oh=00659dd7faaa026b0087506c99a2aa83&oe=5FFDAB4F", "Plant Recipes"),
              ContenedorS("https://scontent-mad1-1.cdninstagram.com/v/t51.2885-15/s150x150/93815266_244395606926767_8706067609000436949_n.jpg?_nc_ht=scontent-mad1-1.cdninstagram.com&_nc_ohc=ZbpkGsETrBwAX_rxXxi&tp=1&oh=b82b089ead8f1cc649f2bda502dad781&oe=5FFD682E", "Muskoka"),
              ContenedorS("https://scontent-mad1-1.cdninstagram.com/v/t51.2885-15/s150x150/119912108_333426634637262_5260483294503197450_n.jpg?_nc_ht=scontent-mad1-1.cdninstagram.com&_nc_ohc=Wg-O00ptijUAX963LaL&tp=1&oh=9017ff1cbf8386bad2117d52b52d3e72&oe=5FFED2D8", "Greatest Hits"),
            ]
        )
    );
  }
}

class ContenedorS extends StatelessWidget {

  final String ruta;
  final String texto;
  const ContenedorS(this.ruta, this.texto);

  @override
  Widget build(BuildContext context) {
    return Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Foto(ruta),
          Text(texto, style: TextStyle(color: Colors.black)) //color de las letras de debajo
        ]
    );
  }
}

class Foto extends StatelessWidget {

  final String ruta;
  const Foto(this.ruta);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.grey, // color del borde de las stories
        shape: BoxShape.circle,
      ),
      padding: EdgeInsets.all(1),
      margin: EdgeInsets.all(10),
      child: CircleAvatar(
          backgroundColor: Colors.black,
          maxRadius: 33,
          backgroundImage: NetworkImage(ruta)
      ),
    );
  }
}