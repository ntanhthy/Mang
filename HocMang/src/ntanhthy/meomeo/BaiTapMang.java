package ntanhthy.meomeo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * tạo mảng random nhưng ko trùng, số sau lớn hơn số trước
 */
//Duyệt: cho chạy từng phần tử trong 1 mảng hay 1 tập hợp
public class BaiTapMang {
	/**
	 * Hàm tạo mảng random ko trùng, số  sau lớn hơn số trước
	 * @param M mảng kiểu int
	 * @param n số phần tử nhập vào
	 * @return mảng đã thực hiện các yêu cầu
	 * Random mảng
	 * Không được trùng nhau
	 * 		- i=0: số nào cũng được
	 * 		- i++: các số còn lại khác số i trc đó
	 * 			dùng vòng lặp duyệt so sánh vs các vị trí trc. nếu trùng thì random lại, ko trùng thì tiếp tục.
	 * Số sau lớn hơn số trước: Sort 
	 */
	static void randomMang(int[] M)
	{
		Random rd = new Random();
		for(int i=0; i<M.length;i++)
		{
			M[i]=rd.nextInt(10);
			if (i==0)
			{
				M[i]=rd.nextInt(10);
			}
			else
			{
				for(int j=1; j<i;j++)
				{
					if(M[j]==M[i])
					{
						M[i]=rd.nextInt(10);
					}
					else
						break;
				}
			}
		}
	}
	static void xuatMang(int [] M)
	{
		for (int i=0; i<M.length; i++)
		{
			System.out.print(M[i]);
			System.out.print("\t");
		}
	}
	/**
	 * Hàm tìm kiếm số trong mảng
	 * @param M mảng kiểu int
	 * @param x số cần tìm
	 * Duyệt so sánh các phần tử trong mảng và xuất ra vị trí của phần tử cần tìm
	 */
	static void timKiemSoTrongMang(int [] M, int x)
	{
		for (int i=0; i<M.length;i++)
		{
			if(M[i]==x)
			{
				System.out.println("Vị trí số "+x+" trong mảng là: "+(i+1));
			}
		}
	}
	public static void main(String[] args) {
		while(true)
		{
			int [] M;
			int n;
			System.out.println("Nhập số phần tử: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			M = new int [n];
			randomMang(M);
			Arrays.sort(M);
			xuatMang(M);
			System.out.println();
			System.out.println("Nhập số cần tìm trong mảng: ");
			int x = sc.nextInt();
			timKiemSoTrongMang(M, x);
			break;
		}	
	}
}
