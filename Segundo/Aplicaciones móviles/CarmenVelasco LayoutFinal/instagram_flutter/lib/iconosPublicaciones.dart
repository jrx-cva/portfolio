
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';

class iconosPublicaciones extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.only(top: 13, bottom: 10),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          //icono publicaciones
          Expanded(
              child: Container(
                child: Icon(Icons.view_module_outlined, color: Colors.black, size: 35),
                decoration: BoxDecoration(border: Border(bottom: BorderSide(color: Colors.grey[100], width: 1))),
              )
          ),

          //icono compras
          Expanded(
              child: Icon(Icons.local_mall, color: Colors.grey[500], size: 35)
          ),

          //icono perfil
          Expanded(
              child: Icon(Icons.assignment_ind, color: Colors.grey[500], size: 35)
          )

        ],
      ),
    );
  }
}