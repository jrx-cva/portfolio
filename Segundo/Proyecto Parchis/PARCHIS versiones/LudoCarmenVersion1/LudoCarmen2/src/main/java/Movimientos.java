import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Movimientos extends JPanel implements KeyListener, ActionListener,MouseListener{
	
	private static final long serialVersionUID = 1L;
	Layout la;
	ConstruirJugadores bp;
	Timer time;
	int delay=10;
	int current_player,dice;
	int flag=0,roll,kill=0;

	/**
	 * Constructor de la clase
	 */
	public Movimientos() {
        setFocusTraversalKeysEnabled(false);
        requestFocus();
        current_player=0;
        la = new Layout(80,50);
        bp=new ConstruirJugadores(la.height,la.width);
        dice=0;
        flag=0;
        roll=0;
        kill=0;
    }

	/**
	 * Metodo
	 * @param g
	 */
	@Override
    public void paint(Graphics g) {
    	la.draw((Graphics2D)g); //layout
    	bp.draw((Graphics2D)g); //Build_player

		//Si movimientos del jugador
    	if(bp.jugador[current_player].coin==4) {
    		g.setColor(Color.WHITE);
    		g.fillRect(590, 100, 380,130);
    		if(current_player==0) {
				g.setColor(Color.RED);
			}
			else if(current_player==1) {
				g.setColor(Color.GREEN);
			}
			else if(current_player==2) {
				g.setColor(Color.YELLOW);
			}
			else if(current_player==3) {
				g.setColor(Color.BLUE);
			}
            g.setFont(new Font("serif", Font.BOLD, 40));
            g.drawString("Jugador "+(current_player+1)+" ha ganado.", 600, 150);
            g.drawString("Felicidadees <3.", 600, 200);
            current_player=0;
            la = new Layout(80,50);
            bp=new ConstruirJugadores(la.height,la.width);
            dice=0;
            flag=0;
            roll=0;
            kill=0;
    	}
    	else if(dice!=0) {
    		g.setColor(Color.WHITE);
    		g.fillRect(590, 100, 380,130);
    		if(current_player==0) {
				g.setColor(Color.RED);
			}
			else if(current_player==1) {
				g.setColor(Color.GREEN);
			}
			else if(current_player==2) {
				g.setColor(Color.YELLOW);
			}
			else if(current_player==3) {
				g.setColor(Color.BLUE);
			}
            g.setFont(new Font("serif", Font.BOLD, 40));
            g.drawString("Jugador "+(current_player+1), 600, 150);
            g.drawString("Número del dado: "+dice, 600, 200);
    	}
    	if(flag==0&&dice!=0&&dice!=6&&kill==0) {
			current_player=(current_player+1)%4;
		}
    	kill=0;
    }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		//if que dicta que la tecla "Enter" sea la que tire el dado
		if (e.getKeyCode() == KeyEvent.VK_ENTER&&flag==0) {
			roll=0;
			dice=1 + (int)(Math.random() * 6);
			repaint();
			for(int i=0;i<4;i++) {
    			if(bp.jugador[current_player].casillas[i].current!=-1&&bp.jugador[current_player].casillas[i].current!=56&&(bp.jugador[current_player].casillas[i].current+dice)<=56) {
    				flag=1;
    				break;
    			}
    		}

			//if cual proposito es definir que solo puede salir de la casilla si el dado es 5
    		if(flag==0&&dice==5) {
    			for(int i=0;i<4;i++) {
    				if(bp.jugador[current_player].casillas[i].current==-1) {
    					flag=1;
    					break;
    				}
    			}
    		}


		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(flag==1) {
			int x=e.getX();
			int y=e.getY();
			x=x-80;
			y=y-50;
			x=x/30;
			y=y/30;
			int value=-1;
			//System.out.println(x+" "+y);
			if(dice==6) {
				for(int i=0;i<4;i++) {
					if(bp.jugador[current_player].casillas[i].x==x&&bp.jugador[current_player].casillas[i].y==y&&(bp.jugador[current_player].casillas[i].current+dice)<=56) {
						value=i;
						flag=0;
						break;
					}	
				}
				if(value!=-1) {
					bp.jugador[current_player].casillas[value].current+=dice;
					if(bp.jugador[current_player].casillas[value].current==56) {
						bp.jugador[current_player].coin++;
					}
					int k=0;
					int hou=bp.jugador[current_player].casillas[value].current;
					if((hou%13)!=0&&(hou%13)!=8&&hou<51)
					{
					for(int i=0;i<4;i++) {
						if(i!=current_player) {
							for(int j=0;j<4;j++) {
								int tem1=Path.ax[current_player][bp.jugador[current_player].casillas[value].current],tem2=Path.ay[current_player][bp.jugador[current_player].casillas[value].current];
								if(bp.jugador[i].casillas[j].x==tem1&&bp.jugador[i].casillas[j].y==tem2) {
									bp.jugador[i].casillas[j].current=-1;
									kill=1;
									k=1;
									break;
								}
							}
						}
						if(k==1)
							break;
					}
					}
				}
				else {
					for(int i=0;i<4;i++) {
						if(bp.jugador[current_player].casillas[i].current==-1) {
							bp.jugador[current_player].casillas[i].current=0;
							flag=0;
							break;
						}	
					}
				}
			}
			else {
				for(int i=0;i<4;i++) {
					if(bp.jugador[current_player].casillas[i].x==x&&bp.jugador[current_player].casillas[i].y==y&&(bp.jugador[current_player].casillas[i].current+dice)<=56) {
						value=i;
						flag=0;
						break;
					}	
				}
				if(value!=-1) {
					bp.jugador[current_player].casillas[value].current+=dice;
					if(bp.jugador[current_player].casillas[value].current==56) {
						bp.jugador[current_player].coin++;
					}
					int k=0;
					int hou=bp.jugador[current_player].casillas[value].current;
					if((hou%13)!=0&&(hou%13)!=8&&hou<51)
					{
					for(int i=0;i<4;i++) {
						if(i!=current_player) {
							for(int j=0;j<4;j++) {
								int tem1=Path.ax[current_player][bp.jugador[current_player].casillas[value].current],tem2=Path.ay[current_player][bp.jugador[current_player].casillas[value].current];
								if(bp.jugador[i].casillas[j].x==tem1&&bp.jugador[i].casillas[j].y==tem2) {
									bp.jugador[i].casillas[j].current=-1;
									kill=1;
									k=1;
									break;
								}
							}
						}
						if(k==1)
							break;
					}
					}
				}
			}
			repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
