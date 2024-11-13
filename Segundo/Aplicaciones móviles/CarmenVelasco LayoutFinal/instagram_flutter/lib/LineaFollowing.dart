import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';


class LineaFollowing extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: 8),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          //Boton Following
          Expanded(
              child: Container(
                padding: EdgeInsets.all(3),
                child: Center(
                    child: Text("Following", style: TextStyle(
                        color: Colors.black,
                        fontSize: 13,
                        fontFamily: "AbrilFatface"))
                ),
                decoration: BoxDecoration(
                    border: Border.all(color: Colors.grey, width: 0.5)),
              )
          ),

          //Boton Message
          Expanded(
              child: Container(
                padding: EdgeInsets.all(3),
                child: Center(
                    child: Text("Message", style: TextStyle(
                        color: Colors.black,
                        fontSize: 13,
                        fontFamily: "AbrilFatface")),

                ),

                decoration: BoxDecoration(
                    border: Border.all(color: Colors.grey, width: 0.5)),
              )
          ),

          //Boton Contact
          Expanded(
              child: Container(
                padding: EdgeInsets.all(3),
                child: Center(
                    child: Text("Contact", style: TextStyle(
                        color: Colors.black,
                        fontSize: 13,
                        fontFamily: "AbrilFatface"))
                ),
                decoration: BoxDecoration(
                    border: Border.all(color: Colors.grey, width: 0.5)),
              )
          ),

          //Boton
          Expanded(
              child: Container(
                padding: EdgeInsets.all(3),
                child: Center(
                    child: Icon(
                    Icons.arrow_drop_down,
                    color: Colors.black,
                    size: 17,
                    )
                ),
                decoration: BoxDecoration(
                    border: Border.all(color: Colors.grey, width: 0.5)),
              )
          )
        ],
      ),);
  }
}