import 'package:flutter/material.dart';

class Pantalla extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new Drawer(
      child: ListView(
        children: <Widget>[
          new UserAccountsDrawerHeader(

            accountName: Text("Carmen Velasco", style: TextStyle(color: Colors.black)),
            accountEmail: Text("a_carmenmaria.velasco.acosta@iespablopicasso.es", style: TextStyle(color: Colors.black)),

            decoration: BoxDecoration(
                image: DecorationImage(
                    image: NetworkImage("https://pbs.twimg.com/profile_images/1021416872443604993/fzSkR-5j.jpg"),
                    fit: BoxFit.cover
                )),),
          Ink(
            color: Colors.black,
            child: new ListTile(
                title: Text("PRIMERO", style: TextStyle(color: Colors.white))
            ),

          ),

          Ink(
            color: Colors.black26,
            child: new ListTile(
                title: Text("SEGUNDO", style: TextStyle(color: Colors.white70))
            ),

          ),

          Ink(
            color: Colors.white54,
            child: new ListTile(
                title: Text("TERCERO", style: TextStyle(color: Colors.black45))
            ),

          ),

          Ink(
            color: Colors.white,
            child: new ListTile(
                title: Text("CUARTO", style: TextStyle(color: Colors.black))
            ),),
        ],
      ),);
  }
}