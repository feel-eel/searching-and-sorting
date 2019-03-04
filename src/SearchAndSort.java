import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		SearchAndSort sas = new SearchAndSort();
		Scanner in = new Scanner(System.in);
		
		String target = "";
		
		System.out.println("What algorithm would you like to execute?");
		String algorithm = in.nextLine();
		System.out.println("What type of data?");
		String type = in.nextLine();
		System.out.println("How is it stored?");
		String stored = in.nextLine();
		System.out.println("Enter the data.");
		String numbers = in.nextLine();
		if (algorithm.equals("linear") || algorithm.equals("binary ") || algorithm.equals("linear ") || algorithm.equals("binary")) { 
			System.out.println("Enter the target value.");
			target = in.nextLine();
		}
		
		// for arraylist
		ArrayList<Integer> data = new ArrayList<Integer>();
		ArrayList<String> dataS = new ArrayList<String>();
		
		String[] number = numbers.split(",\\s+");
		for (int i = 0; i < number.length; i++) {
			if (type.equals("int")) {
				data.add(Integer.parseInt(number[i]));
			} else if (type.equals("string")) {
				dataS.add(number[i]);
			}
			
		} 
		
		// for array
		int[] aData = new int[data.size()];
		String[] aDataS = new String[dataS.size()];
		
		if (stored.equals("array")) {
			for (int i = 0; i < number.length; i++) {
				if (type.equals("int")) {
					aData[i] = data.get(i);
				} else if (type.equals("string")) {
					aDataS[i] = dataS.get(i);
					
				}
				
			} 
			
		
			
			if (type.equals("int")) {
				//sort
				if (algorithm.equals("bubble") || algorithm.equals("bubble ")) {
					System.out.println("Bubble: " + Arrays.toString(sas.bubbleA(aData)));
				} else if (algorithm.equals("selection") | algorithm.equals("selection ")) {
					System.out.println("Selection: " +  Arrays.toString(sas.selectionA(aData)));
				} else if (algorithm.equals("insertion") | algorithm.equals("insertion ")) {
					System.out.println("Insertion: " + Arrays.toString(sas.insertionA(aData)));
				} else if (algorithm.equals("merge") | algorithm.equals("merge ")) {
					System.out.println("Merge: " + Arrays.toString(sas.mergeA(aData)));
				} 
				
				//search
				if (algorithm.equals("linear") || algorithm.equals("linear ")) {
					System.out.println("Linear: " + sas.linearA(aData, Integer.parseInt(target)));
				} else if (algorithm.equals("binary") || algorithm.equals("binary ")) {
					System.out.println("Binary: " + sas.binaryA(aData, Integer.parseInt(target)));
				} 
			}
			
			
			if (type.equals("string")) {
				//sort
				if (algorithm.equals("bubble") || algorithm.equals("bubble ")) {
					System.out.println("Bubble: " + Arrays.toString(sas.bubbleAS(aDataS)));
				} else if (algorithm.equals("selection") | algorithm.equals("selection ")) {
					System.out.println("Selection: " +  Arrays.toString(sas.selectionAS(aDataS)));
				} else if (algorithm.equals("insertion") | algorithm.equals("insertion ")) {
					System.out.println("Insertion: " + Arrays.toString(sas.insertionAS(aDataS)));
				} else if (algorithm.equals("merge") | algorithm.equals("merge ")) {
					System.out.println("Merge: " + Arrays.toString(sas.mergeAS(aDataS)));
				} 
				
				//search
				if (algorithm.equals("linear") || algorithm.equals("linear ")) {
					System.out.println("Linear: " + sas.linearAS(aDataS, target));
				} else if (algorithm.equals("binary") || algorithm.equals("binary ")) {
					System.out.println("Binary: " + sas.binaryAS(aDataS, target));
				} 
			}
			
			
		} 
		// ARRAYLIST------------------------------------------------------------------------------------
		else if (stored.equals("arraylist") || stored.equals("list")) {
			
			
			if (type.equals("int")) {
				// sort
				if (algorithm.equals("bubble") || algorithm.equals("bubble ")) {
					System.out.println("Bubble: " + sas.bubble(data));
				} else if (algorithm.equals("selection") | algorithm.equals("selection ")) {
					System.out.println("Selection: " + sas.selection(data));
				} else if (algorithm.equals("insertion") | algorithm.equals("insertion ")) {
					System.out.println("Insertion: " + sas.insertion(data));
				} else if (algorithm.equals("merge") | algorithm.equals("merge ")) {
					System.out.println("Merge: " + sas.merge(data));
				} 
				
				//search
				if (algorithm.equals("linear") || algorithm.equals("linear ")) {
					System.out.println("Linear: " + sas.linear(data, Integer.parseInt(target)));
				} else if (algorithm.equals("binary") || algorithm.equals("binary ")) {
					System.out.println("Binary: " + sas.binary(data, Integer.parseInt(target)));
				} 
			} else if (type.equals("string")) {
				// sort
				if (algorithm.equals("bubble") || algorithm.equals("bubble ")) {
					System.out.println("Bubble: " + sas.bubbleS(dataS));
				} else if (algorithm.equals("selection") | algorithm.equals("selection ")) {
					System.out.println("Selection: " + sas.selectionS(dataS));
				} else if (algorithm.equals("insertion") | algorithm.equals("insertion ")) {
					System.out.println("Insertion: " + sas.insertionS(dataS));
				} else if (algorithm.equals("merge") | algorithm.equals("merge ")) {
					System.out.println("Merge: " + sas.mergeS(dataS));
				} 
				
				//search
				if (algorithm.equals("linear") || algorithm.equals("linear ")) {
					System.out.println("Linear: " + sas.linearS(dataS, target));
				} else if (algorithm.equals("binary") || algorithm.equals("binary ")) {
					System.out.println("Binary: " + sas.binaryS(dataS, target));
				} 
			}
			
			
		}
			
			
		
			

		in.close();
	}
	
	public ArrayList<Integer> bubble(ArrayList<Integer> data) {
		if (data == null) {
			return null;
		} 
		int counter = 0;
		do {
			counter = 0;
			for (int i = 0; i < data.size() - 1; i++) {
				if (data.get(i) > data.get(i + 1)) {
					int temp = data.get(i);
					data.set(i, data.get(i + 1));
					data.set(i + 1, temp);
					counter++;
				}
			}
		} while (counter != 0);
		return data;
	}
	
	public ArrayList<String> bubbleS(ArrayList<String> data) {
		if (data == null) {
			return null;
		} 
		int counter = 0;
		do {
			counter = 0;
			for (int i = 0; i < data.size() - 1; i++) {
				if (data.get(i).compareTo(data.get(i + 1)) > 0 ) {
					String temp = data.get(i);
					data.set(i, data.get(i + 1));
					data.set(i + 1, temp);
					counter++;
				}
			}
		} while (counter != 0);
		return data;
	}
	
	public int[] bubbleA(int[] data) {
		if (data == null) {
			return null;
		} 
		int counter = 0;
		do {
			counter = 0;
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i + 1]) {
					int temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					counter++;
				}
			}
		} while (counter != 0);
		return data;
	}
	
	public String[] bubbleAS(String[] data) {
		if (data == null) {
			return null;
		} 
		int counter = 0;
		do {
			counter = 0;
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i].compareTo(data[i + 1]) > 0) {
					String temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					counter++;
				}
			}
		} while (counter != 0);
		return data;
	}
	
	
	public ArrayList<Integer> selection(ArrayList<Integer> data) {
		if (data == null) {
			return null;
		} 
		
		for(int i = 0; i < data.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(minIndex) > data.get(j)) {
					minIndex = j;
				}
			}
			int temp = data.get(minIndex);
			data.set(minIndex, data.get(i));
			data.set(i, temp);
		}
		return data;
		
	}
	
	public ArrayList<String> selectionS(ArrayList<String> data) {
		if (data == null) {
			return null;
		} 
		
		for(int i = 0; i < data.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(minIndex).compareTo(data.get(j)) > 0) {
					minIndex = j;
				}
			}
			String temp = data.get(minIndex);
			data.set(minIndex, data.get(i));
			data.set(i, temp);
		}
		return data;
		
	}
	
	public int[] selectionA(int[] data) {
		if (data == null) {
			return null;
		} 
		
		for(int i = 0; i < data.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[minIndex] > data[j]) {
					minIndex = j;
				}
			}
			int temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		return data;
		
	}
	
	public String[] selectionAS(String[] data) {
		if (data == null) {
			return null;
		} 
		
		for(int i = 0; i < data.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[minIndex].compareTo(data[j]) > 0) {
					minIndex = j;
				}
			}
			String temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		return data;
		
	}
	
	public ArrayList<Integer> insertion(ArrayList<Integer> data) {
		if (data == null) {
			return null;
		} 
		int min = data.get(0);
		int counter = 0;
		for (int i = 0; i < data.size(); i++) {
			int x = data.get(i);
			int j = i-1;
			
			while(j >=0 && data.get(j) > x) {
				data.set(j+1, data.get(j));
				j--;
			}
			data.set(j+1,  x);
		}
		return data;
	}
	
	public ArrayList<String> insertionS(ArrayList<String> data) {
		if (data == null) {
			return null;
		} 
		
		for (int i = 0; i < data.size(); i++) {
			String x = data.get(i);
			int j = i-1;
			
			while(j >=0 && data.get(j).compareTo(x) > 0) {
				data.set(j+1, data.get(j));
				j--;
			}
			data.set(j+1,  x);
		}
		return data;
	}
	
	public int[] insertionA(int[] data) {
		if (data == null) {
			return null;
		} 
		int min = data[0];
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			int x = data[i];
			int j = i-1;
			
			while(j >=0 && data[j] > x) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] =  x;
		}
		return data;
	}
	
	public String[] insertionAS(String[] data) {
		if (data == null) {
			return null;
		} 
		
		for (int i = 0; i < data.length; i++) {
			String x = data[i];
			int j = i-1;
			
			while(j >=0 && data[j].compareTo(x) > 0) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] =  x;
		}
		return data;
	}
	
	public ArrayList<Integer> merge(ArrayList<Integer> data) {
		if (data.size() == 1) {
			return data;
		}
		
		ArrayList<Integer> left = new ArrayList(data.subList(0, data.size()/2));
		ArrayList<Integer> right =  new ArrayList(data.subList(data.size()/2, data.size()));
		
		left = merge(left);
		right = merge(right);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < left.size() && j < right.size()) {
			if (left.get(i) <= right.get(j)) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		
		while (i < left.size()) {
			data.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < right.size()) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
		return data;
		
	}
	
	public ArrayList<String> mergeS(ArrayList<String> data) {
		if (data.size() == 1) {
			return data;
		}
		
		ArrayList<String> left = new ArrayList(data.subList(0, data.size()/2));
		ArrayList<String> right =  new ArrayList(data.subList(data.size()/2, data.size()));
		
		left = mergeS(left);
		right = mergeS(right);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < left.size() && j < right.size()) {
			if (left.get(i).compareTo(right.get(j)) <= 0) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		
		while (i < left.size()) {
			data.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < right.size()) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
		return data;
		
	}
	
	

	
	public int[] mergeA(int[] data) {
		if (data.length == 1) {
			return data;
		}
		
		int[] left = Arrays.copyOfRange(data, 0, data.length/2);
		int[] right =  Arrays.copyOfRange(data, data.length/2, data.length);
		
		left = mergeA(left);
		right = mergeA(right);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < left.length) {
			data[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			data[k] = right[j];
			j++;
			k++;
		}
		return data;
	}
	
	public String[] mergeAS(String[] data) {
		if (data.length == 1) {
			return data;
		}
		
		String[] left = Arrays.copyOfRange(data, 0, data.length/2);
		String[] right =  Arrays.copyOfRange(data, data.length/2, data.length);
		
		left = mergeAS(left);
		right = mergeAS(right);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < left.length && j < right.length) {
			if (left[i].compareTo(right[j]) <= 0 ) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < left.length) {
			data[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			data[k] = right[j];
			j++;
			k++;
		}
		return data;
	}
	
	public int linear(ArrayList<Integer> data, int target) {
		
		for (int i = 0; i < data.size(); i++) {
			if (target == data.get(i)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public int linearS(ArrayList<String> data, String target) {
		
		for (int i = 0; i < data.size(); i++) {
			if (target.equals( data.get(i))) {
				return i;
			}
		}
		return -1;
		
	}
	
	public int linearA(int[] data, int target) {
		
		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return i;
			}
		}
		return -1;
		
	}
	public int linearAS(String[] data, String target) {
		
		for (int i = 0; i < data.length; i++) {
			if (target.equals( data[i])) {
				return i;
			}
		}
		return -1;
		
	}
	
	public int binary(ArrayList<Integer> data, int target) {
		ArrayList<Integer> sortedData = bubble(data);
		
		
		int first = 0;
		int last = sortedData.size() - 1;
		int mid = (sortedData.size() - 1)/2;
		
		while(first <= last) {
			if (target > sortedData.get(mid)) {
				first = mid + 1;
			} else if (target == sortedData.get(mid)) {
				return mid;
			} else { 
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return -1;
		
	}
	
	public int binaryS(ArrayList<String> data, String target) {
		ArrayList<String> sortedData = bubbleS(data);
		
		
		int first = 0;
		int last = sortedData.size() - 1;
		int mid = (sortedData.size() - 1)/2;
		
		while(first <= last) {
			if (target.compareTo(sortedData.get(mid)) > 0) {
				first = mid + 1;
			} else if (target.equals( sortedData.get(mid))) {
				return mid;
			} else { 
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return -1;
		
	}
	
	public int binaryA(int[] data, int target) {
		int[] sortedData = bubbleA(data);
		
		
		int first = 0;
		int last = sortedData.length - 1;
		int mid = (sortedData.length - 1)/2;
		
		while(first <= last) {
			if (target > sortedData[mid]) {
				first = mid + 1;
			} else if (target == sortedData[mid]) {
				return mid;
			} else { 
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return -1;
		
	}
	
	public int binaryAS(String[] data, String target) {
		String[] sortedData = bubbleAS(data);
		
		
		int first = 0;
		int last = sortedData.length - 1;
		int mid = (sortedData.length - 1)/2;
		
		while(first <= last) {
			if (target.compareTo(sortedData[mid]) > 0) {
				first = mid + 1;
			} else if (target.equals(sortedData[mid])) {
				return mid;
			} else { 
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return -1;
		
	}

}