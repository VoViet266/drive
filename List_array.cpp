#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define  Maxlength 100
typedef int Elementtype;
typedef int position;
typedef struct List{
	Elementtype element[Maxlength];
	position last;
}; 
//khoi tao danh sach rong
void Makenull_List(List *L){
	L->last=0;
}
//kiem tra danh sach rong
int Emty_List(List L){
	return (L.last== 0);
}
//kiem tra danh sach day
int Full_List(List L){
	return (L.last == Maxlength);
}
//	
void Insert_List( Elementtype x, position p, List *L){
	if(Full_List(*L)){
		printf("/n Full List");
	}
	else if(p<1 || p>L->last+1){
		printf("\n Unvalued position");
	}
	else{
		position i;
		for(i=L->last; i>=p;i--){
			L->element[i] = L->element[i-1];
		}
		L->element[p-1]=x;
		L->last++;
	}
}
void Detele_List( position p, List *L){
	if(Emty_List(*L)){
		printf("\n Emty List");
	}
	else if(p<1 || p>L->last+1){
		printf("\n Unvalued position");
	}
	else{
		position i;
		for(i = p; i<L->last;i++){
			L->element[i-1] = L->element[i];
		}
		L->last--;
	}

}
Elementtype Retrieve_List(position p, List L){
	if(p>=1 && p<=L.last){
		return (L.element[p-1]);
	}
}
position First_List(List L){
	return 1;
}
position End_List(List L){
	return L.last+1;
}
void Read_List(List *L){
	int n, i;
	Elementtype x;
	printf("\n So phan tu cua danh sach: ");
	scanf("%d", &n);
	for(i = 0; i < n; i++){
		printf("\n Nhap phan tu thu %d = ", i+1);
		scanf("%d", &x);
		Insert_List(x, End_List(*L), L);
	}
}
position Next_List(position p, List L){
	return p = ++p;
}
position Search_list(Elementtype x, List L){
	position p = First_List(L);
	int found = 0;
	while(p != End_List(L) && !found){
		if(Retrieve_List(p, L) == x){
			found = 1;
		}
		else
		{
			p = Next_List(p, L);
		}
	}
	return p;
}
void Print_List(List L){
	position p;
	printf("\n Danh sach gom: \n");
	for(p = 1; p<=L.last; p++){
		printf("\t %d", Retrieve_List(p, L));
	}
}
