// This is a basic Flutter widget test.
//
// To perform an interaction with a widget in your test, use the WidgetTester
// utility that Flutter provides. For example, you can send tap and scroll
// gestures. You can also use WidgetTester to find child widgets in the widget
// tree, read text, and verify that the values of widget properties are correct.

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';

import 'package:flutter_app/main.dart';




/*
class MyImageWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var assetsImage = new AssetImage('assets/imagen.jpg');
    var assetsImage2 = new AssetImage('assets/imagen2.jpg');
    var assetsImage3 = new AssetImage('assets/imagen3.jpg');

    var image = new Image(image: assetsImage, width: 48.0, height: 48.0);
    var image2 = new Image(image: assetsImage2, width: 48.0, height: 48.0);
    var image3 = new Image(image: assetsImage3, width: 48.0, height: 48.0);

    return Container(child: image);
  }
}
*/

void main() {
  testWidgets('Counter increments smoke test', (WidgetTester tester) async {
    // Build our app and trigger a frame.
    await tester.pumpWidget(MyApp());

    // Verify that our counter starts at 0.
    expect(find.text('0'), findsOneWidget);
    expect(find.text('1'), findsNothing);

    // Tap the '+' icon and trigger a frame.
    await tester.tap(find.byIcon(Icons.add));
    await tester.pump();

    // Verify that our counter has incremented.
    expect(find.text('0'), findsNothing);
    expect(find.text('1'), findsOneWidget);
  });
}
