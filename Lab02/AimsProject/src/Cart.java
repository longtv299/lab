import javax.swing.JOptionPane;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc ItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED+1];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			qtyOrdered++;
			ItemsOrdered[qtyOrdered]=disc;
			System.out.println("The disc "+ItemsOrdered[qtyOrdered].getTitle()+" has been added successfully!");
		} else {
			System.out.println("The cart is full. Can not add more disc!");
		}
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
		if ((qtyOrdered + dvdList.length) <= MAX_NUMBERS_ORDERED) {
			for(int i=0;i<=dvdList.length;i++) {
				ItemsOrdered[qtyOrdered+i+1]=dvdList[i];
			}
			qtyOrdered=qtyOrdered+dvdList.length;
			System.out.println("The list of DVD has been added successfully!");
		} else {
			System.out.println("There's not enough blank places to add!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered +2 <= MAX_NUMBERS_ORDERED) {
			ItemsOrdered[qtyOrdered+1]=dvd1;
			ItemsOrdered[qtyOrdered+2]=dvd2;
			qtyOrdered+=2;
			System.out.println("The 2 DVD "+ dvd1.getTitle()+"and "+ dvd2.getTitle()+" has been added!");
		} else {
			System.out.println("There's not enough blank places to add!");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("There is no item in cart!");
		} else {
			int check = 0;
			for(int i=1;i<=qtyOrdered;i++) {
				if(ItemsOrdered[i] == disc) {
					check = 1;
					if (i==qtyOrdered) {
						ItemsOrdered[qtyOrdered]=ItemsOrdered[0];
						qtyOrdered--;
					} else {
						for(int j=i;j<qtyOrdered;j++) {
							ItemsOrdered[j]=ItemsOrdered[j+1];
						}
						ItemsOrdered[qtyOrdered]=ItemsOrdered[0];
						qtyOrdered--;
					}
				}
			}
			if (check==1) {
				System.out.println("The disc "+disc.getTitle()+" has been removed!");
			} else System.out.println("The disc "+disc.getTitle()+" does not exist in cart!");
	  }
	}
	
	public void totalcost() {
		float cost=0;
		if (qtyOrdered > 0) {
			for (int i=1;i<=qtyOrdered;i++) {
				cost += ItemsOrdered[i].getCost();
			}
			System.out.println("The total cost in cart : "+cost);
		} else {
			System.out.println("The cart is empty!");
		}
	}

}
