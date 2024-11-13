import 'dart:ui';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';

class Cabecera extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
        padding: EdgeInsets.only(left: 5, right: 10, top: 5),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Container(
              padding: EdgeInsets.all(5),
              child: CircleAvatar(
                maxRadius: 40,
                backgroundImage: NetworkImage('https://pbs.twimg.com/profile_images/1021416872443604993/fzSkR-5j.jpg'),
              ),
            ),
            Padding(padding: EdgeInsets.all(5.0)),
            Expanded(
              child: Column(
                children: [
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [
                      //Post, followers y following
                      Column(
                        children: [
                          Text('2,279', style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold, fontSize: 18)),
                          Text('Posts', style: TextStyle(color: Colors.black, fontSize: 14)),
                        ],
                      ),

                      Column(
                        children: [
                          Text('48.9 k', style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold, fontSize: 18)),
                          Text('Followers', style: TextStyle(color: Colors.black, fontSize: 14)),
                        ],
                      ),

                      Column(
                        children: [
                          Text('2,601', style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold, fontSize: 18)),
                          Text('Following', style: TextStyle(color: Colors.black, fontSize: 14)),
                        ],
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ],
        ));
  }
}