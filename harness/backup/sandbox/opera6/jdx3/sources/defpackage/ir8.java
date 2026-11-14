package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.opera.api.Callback;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class ir8 implements Callback {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ir8(Context context, int i, String str, Callback callback) {
        this.c = context;
        this.b = i;
        this.d = str;
        this.e = callback;
    }

    public /* synthetic */ ir8(buj bujVar, int i, File file, String str) {
        this.c = bujVar;
        this.b = i;
        this.e = file;
        this.d = str;
    }

    public /* synthetic */ ir8(x79 x79Var, x2g x2gVar, int i, r2g r2gVar) {
        this.c = x79Var;
        this.d = x2gVar;
        this.b = i;
        this.e = r2gVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        Drawable drawableJ;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        int i = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                Context context = (Context) obj4;
                String str = (String) obj2;
                Callback callback = (Callback) obj3;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
                    int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    drawableJ = new uq8(context, gjf.a(context), i2, bitmap);
                    drawableJ.setBounds(0, 0, i, i);
                } else {
                    int i3 = vmj.g;
                    drawableJ = tmj.j(context, str, i, i, 48);
                }
                callback.run(drawableJ);
                break;
            case 1:
                ((x79) obj4).c0((x2g) obj2, i + 1, ((Boolean) obj).booleanValue(), (r2g) obj3);
                break;
            default:
                buj bujVar = (buj) obj4;
                File file = (File) obj3;
                String str2 = (String) obj2;
                yni yniVar = (yni) obj;
                if (yniVar != null) {
                    Bitmap bitmap2 = yniVar.a;
                    bitmap2.setHeight(Math.min(bitmap2.getHeight(), i));
                    he2.a(new ztj(bujVar, file, str2, bitmap2.getHeight() >= bitmap2.getWidth()), new Bitmap[]{bitmap2});
                    break;
                } else {
                    bujVar.a(2132021583);
                    break;
                }
        }
    }
}
