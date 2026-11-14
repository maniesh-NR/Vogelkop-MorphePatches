package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final /* synthetic */ class q14 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q14(int i, String str, EnumDescriptor enumDescriptor) {
        this.a = (byte) 2;
        this.b = i;
        this.c = str;
        this.d = enumDescriptor;
    }

    public /* synthetic */ q14(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ q14(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public final Object invoke() throws IOException {
        Object next;
        byte b = this.a;
        int i = 0;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) obj2).getResources().openRawResource(((TypedArray) obj).getResourceId(i2, 0)), Charsets.UTF_8), 8192);
                try {
                    List listG = y1j.g(new do5(new d82(bufferedReader, (byte) 2)));
                    bufferedReader.close();
                    List list = listG;
                    ArrayList arrayList = new ArrayList(k95.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List listY = StringsKt.Y((String) it.next(), new String[]{","}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listY) {
                            if (xkm.a((String) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList.add(CollectionsKt.k0(arrayList2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList.get(i3);
                        i3++;
                        if (!((List) obj4).isEmpty()) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
                    int size2 = arrayList3.size();
                    while (i < size2) {
                        Object obj5 = arrayList3.get(i);
                        i++;
                        List list2 = (List) obj5;
                        arrayList4.add(new nz7((String) CollectionsKt.K(list2), CollectionsKt.G(list2, 1)));
                    }
                    return arrayList4;
                } finally {
                }
            case 1:
                ((Function1) obj2).invoke(Integer.valueOf(i2));
                ((afe) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 2:
                String str = (String) obj2;
                EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    serialDescriptorArr[i4] = xug.g(str + '.' + ((PluginGeneratedSerialDescriptor) enumDescriptor).e[i4], xik.e, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            case 3:
                int[] iArr = (int[]) obj;
                qe6 qe6VarH = ((on9) ((rn9) obj2).d).H();
                if (qe6VarH != null && iArr.length != 0) {
                    ((lba) qe6VarH.b).getView().postDelayed(new d50(qe6VarH, iArr, i2, (byte) 4), 500L);
                }
                return Unit.a;
            case 4:
                return Http2Connection.h((Http2Connection) obj2, i2, (List) obj);
            case 5:
                ndf ndfVar = (ndf) obj;
                Iterator it2 = ((u6c) obj2).j().l.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((n6c) next).a == i2) {
                        }
                    } else {
                        next = null;
                    }
                }
                float f = 0.0f;
                if (((n6c) next) != null) {
                    float fB = djh.b(1.0f - (Math.abs(((r1.m / 2.0f) + r1.l) - ((r8.m + r8.n) / 2.0f)) / ndfVar.d), 0.0f, 1.0f);
                    if (fB > 0.99f) {
                        f = 1.0f;
                    } else if (fB >= 0.01f) {
                        f = fB;
                    }
                }
                return Float.valueOf(f);
            default:
                int[] iArr2 = ProductSuggestionListItem.u;
                ((ProductSuggestionListItem) obj2).s((c3h) obj, i2);
                return Unit.a;
        }
    }
}
