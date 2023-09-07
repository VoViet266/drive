#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include "List_array.cpp"
// hoan vi 2 phan tu
void Swap(int *a, int *b){
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}
void Bubblesort_List(List *L){
    for (int i = 0; i < L->last; i++)
    {
        for (int j = L->last-1;j>0; j--)
        {
            if (L->element[j] < L->element[j-1])
                { 
                    Swap(&L->element[j], &L->element[j-1]);
                }
        }
    }
}
void Insertsorted_List(List *L){
    Elementtype x;
    printf("\n\tNhap so can them vao danh sach co thu tu ");
    scanf("%d", &x);
    position p = First_List(*L);
    while (p != End_List(*L))
    {
        if (L->element[p-1] > x)
        {
            break;
        }
        else
        {
            p = Next_List(p, *L);
        }
        
    }
    Insert_List(x, p , L);  
}
void Deteleall_List(List *L){
    Elementtype x;
    printf("\n\t nhap so can xoa");
    scanf("%d", &x);
    position p = First_List(*L), i;
    while (p != End_List(*L)){
        if (L->element[p-1] == x){
            for ( i = p; i < L->last; i++)
            {
             L->element[i-1] = L->element[i];
            }
               L->last--;
               p = First_List(*L);
        }
        else
        {
            p = Next_List(p, *L);
        }
    }
}
void Menu_List(){
    List L;
    Makenull_List(&L);
    int input;
    do
    {
        do
        {
            printf("\nCHUONG TRINH QUAN LY DANH SACH SO NGUYEN\n");
            printf("\n\n\t 1.Nhan danh sach");
            printf("\n\n\t 2.Hien thi danh sach");
            printf("\n\n\t 3.Sap sep danh sach");
            printf("\n\n\t 4.Them phan tu vao danh sach");
            printf("\n\n\t 5.Xoa cac phan tu");
            printf("\n\n\t 6.Vi tri dau tien xuat hien");
            printf("\n\n\t 7. Thoat!!!!");
            printf("\n\n\t Vui long chon so: ");
            scanf("%d", &input);
        } while (input < 1 || input > 7);
        switch (input)
        {
        case 1:
            Read_List(&L);
            break;
        case 2:
            Print_List(L);
            break;
        case 3:
            Bubblesort_List(&L);
            break;
        case 4:
            Insertsorted_List(&L);
            break;
        case 5:
            Deteleall_List(&L);
            break;
        case 6:
                Elementtype x;
                printf("\n Vi tri can tim cua x = ");
                scanf("%d", &x);
                printf("\nx = %d vi tri %d", x,Search_list(x , L));
            break;
        case 7:
                exit;
            break;
        default:
        printf("\nSo khong hop le !!\t vui long nhap lai!");
            break;
        }
    } while (input != 7);
}
int main(){
    Menu_List();
}
