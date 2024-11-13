import 'dart:ui';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';

class Biografia extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(10),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Padding(
              padding: EdgeInsets.only(top: 5, bottom: 8),
              child: RichText(

                textAlign: TextAlign.left,
                text: TextSpan(style: TextStyle(fontSize: 14, height: 1.4,fontFamily: "Dosis", color: Colors.black),
                    children: [
                      TextSpan(text: 'Greenhouse\n', style: TextStyle(fontWeight: FontWeight.bold,fontFamily: "Roboto")),
                      TextSpan(text: 'Food & Beverage Company\n', style: TextStyle(fontFamily: "Roboto", color: Colors.grey)),
                      TextSpan(text: '🇨🇦 Recreational Juicing + Plant-Based Hedonism //\n', style: TextStyle(fontFamily: "Roboto") ),
                      TextSpan(text: '🌎 Le futur simple des boissons\n', style: TextStyle(fontFamily: "Roboto") ),
                      TextSpan(text: 'blog.greenhousejuice.com/post/187058446386/co...\n', style: TextStyle(fontFamily: "Roboto", color: Colors.blue)),
                      TextSpan(text: 'Followed by ', style: TextStyle(fontFamily: "Roboto") ),
                      TextSpan(text: 'bluboho, iamwellandgood ', style: TextStyle(fontWeight: FontWeight.bold, fontFamily: "Roboto") ),
                      TextSpan(text: 'and ', style: TextStyle(fontFamily: "Roboto") ),
                      TextSpan(text: '6 others\n', style: TextStyle(fontWeight: FontWeight.bold, fontFamily: "Roboto") ),
                    ]),
              )),
        ],
      ),
    );
  }
}