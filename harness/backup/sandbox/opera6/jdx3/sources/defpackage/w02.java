package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class w02 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a12 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ w02(a12 a12Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = a12Var;
        this.c = arrayList;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.c;
        a12 a12Var = this.b;
        switch (b) {
            case 0:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) a12Var.b.get()).edit();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj;
                    editorEdit.putString((String) pair.a, (String) pair.b);
                }
                editorEdit.apply();
                return Unit.a;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) a12Var.b.get();
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(sharedPreferences.getString((String) obj2, null));
                }
                return arrayList2;
        }
    }
}
