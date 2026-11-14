package defpackage;

import android.graphics.Bitmap;
import android.text.Editable;
import com.opera.hype.image.editor.EditImage;
import com.opera.hype.image.editor.TextBoxEditText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fz2 extends a7f {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fz2(ci7 ci7Var) {
        this.c = (byte) 4;
        Boolean bool = Boolean.FALSE;
        this.d = ci7Var;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(TextBoxEditText textBoxEditText) {
        super(0);
        this.c = (byte) 8;
        this.d = textBoxEditText;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fz2(ft7 ft7Var) {
        this.c = (byte) 9;
        Boolean bool = Boolean.FALSE;
        this.d = ft7Var;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(i76 i76Var) {
        super(-1);
        this.c = (byte) 2;
        this.d = i76Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz2(Object obj, Object obj2, byte b) {
        super(obj);
        this.c = b;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(o8g o8gVar) {
        super(-1);
        this.c = (byte) 5;
        this.d = o8gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(qk3 qk3Var) {
        super(null);
        this.c = (byte) 1;
        this.d = qk3Var;
    }

    @Override // defpackage.a7f
    public final void a(Object obj, Object obj2) {
        byte b = this.c;
        int i = 0;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((Boolean) obj).getClass();
                Iterator it = ((gz2) obj3).b.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(bool);
                }
                break;
            case 1:
                if (!Intrinsics.a((Bitmap) obj, (Bitmap) obj2)) {
                    ((qk3) obj3).a.invalidate();
                    break;
                }
                break;
            case 2:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    ((i76) obj3).a.invalidate();
                    break;
                }
                break;
            case 3:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((zm6) obj3).f();
                break;
            case 4:
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() != bool2.booleanValue()) {
                    ((ci7) obj3).invoke(bool2);
                    break;
                }
                break;
            case 5:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    ((o8g) obj3).a.invalidate();
                    break;
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    ArrayList arrayList = ((lrg) obj3).b;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj4 = arrayList.get(i);
                        i++;
                        hpg hpgVar = (hpg) obj4;
                        if (hpgVar.b() != zBooleanValue) {
                            hpgVar.a(zBooleanValue);
                        }
                    }
                    break;
                }
                break;
            case 7:
                ((fzk) obj3).a();
                break;
            case 8:
                int iIntValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != iIntValue) {
                    TextBoxEditText textBoxEditText = (TextBoxEditText) obj3;
                    xtb[] xtbVarArr = TextBoxEditText.o;
                    Editable editableT = textBoxEditText.getText();
                    if (editableT != null) {
                        if (iIntValue != 0) {
                            textBoxEditText.u(editableT);
                            break;
                        } else {
                            TextBoxEditText.s(editableT);
                            break;
                        }
                    }
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    EditImage editImage = ((ft7) obj3).g;
                    u39 u39Var = new u39(editImage.f());
                    while (u39Var.hasNext()) {
                        TextBoxEditText textBoxEditText2 = ((bfl) u39Var.next()).f;
                        fz2 fz2Var = editImage.e.b;
                        xtb xtbVar = ywl.c[0];
                        textBoxEditText2.k = !((Boolean) fz2Var.b).booleanValue();
                    }
                    break;
                }
                break;
        }
    }
}
