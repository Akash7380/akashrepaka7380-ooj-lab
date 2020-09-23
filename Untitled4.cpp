#include <stdio.h>
 
int main()
{
    int fig_code;
    float   root , height, area, radius, volume;
 
    printf("-------------------------\n");
    printf(" 1 --> Cylinder\n");
    printf(" 2 --> sphere\n");
    printf(" 3 --> cone\n");
    printf("-------------------------\n");
    printf("Enter the Figure code\n");
    scanf("%d", &fig_code);
    switch(fig_code)
    {
    case 1:
        printf("Enter the radius and hieght\n");
        scanf("%f" "%f", &radius, &hieght);
        area = 2* 3.142 * radius * hieght + 2 * 3.14 * radius * radius ; 
        printf("Area of a cylinder = %f\n", area);
        volume = 3.142 * radius * radius * hieght ;
        printf("volume of a cylinder = %f\n", volume);
        break;
    case 2:
        printf("Enter the radius\n");
        scanf("%f" , &radius);
        area = 4 * 3.142 * radius * radius ;
        printf("Area of a sphere = %f\n", area);
        volume = (4/3) * radius * radius * radius ;
        printf("volume of sphere = %f\n");
        break;
    case 3:
        printf("Enter the radius and height\n");
        scanf("%f %f", &radius, &height);
        area = 3.14 * radius ( radius + root( hieght * hieght + radius * radius ) ) ;
        printf("Area of a cone = %f\n", area);
        volume = 3.14 * radius * radius * (hieght/3);
        printf("volume of the cone = %f\n", volume);
        break;
    default:
        printf("Error in figure code\n");
        break;
    }
}

  
