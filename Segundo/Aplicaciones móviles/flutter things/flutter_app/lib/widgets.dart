import 'package:flutter/material.dart';

class Texty extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(child: new Text('This works'));
  }
}

class MyExploreWidgets extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var assetsImage = new AssetImage('assets/whatsapp.png');
    var image = new Image(image: assetsImage, width:48.0, height: 48.0,);
    return Container(child: image);
  }
}