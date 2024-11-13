import 'dart:ui';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';


class Publicaciones extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Flexible(
        child: Padding(
            padding: EdgeInsets.all(1),
            child: GridView.count(
                shrinkWrap: true,
                crossAxisCount: 3,
                crossAxisSpacing: 3,
                mainAxisSpacing: 5,
                children: [
                  Image.asset('assets/foto1.png'),
                  Image.asset('assets/foto2.png'),
                  Image.asset('assets/foto3.png'),
                  Image.asset('assets/foto4.png'),
                  Image.asset('assets/foto5.png'),
                  Image.asset('assets/foto6.png'),
                ]
            )
        )
    );
  }
}
