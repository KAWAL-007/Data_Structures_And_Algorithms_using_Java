int low = 0, high = arr.length - 1;

while(low <= high) {
    int mid = (low + high) / 2;

    if(arr[mid] == key)
        System.out.println("Found");

    else if(arr[mid] < key)
        low = mid + 1;

    else
        high = mid - 1;
}
