# MoveView
直接在XML文件中吊用 
 <lazier.org.moveview.MoveView
            android:id="@+id/move_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:circleX="100"
            app:circleY="100"
            app:colorMin="@color/colorAccent"
            app:colorMax="@color/colorPrimaryDark"
            app:circleR="60"
            app:isClickViewMove="true"
            />
            
 currentX currentY 指圆形图标初始化坐标
 circleR 只圆形图标半径 
 circleStock 圆形的秒变线宽度
 colorMin 内圆形 颜色
 colorMax 描边 颜色


allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
 
 dependencies {
	        implementation 'com.github.chokTang:MoveView:v1.0.0'
	}
