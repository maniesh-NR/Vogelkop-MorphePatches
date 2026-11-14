package defpackage;

import com.leanplum.internal.RequestBuilder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class o02 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o02(long j, oqh oqhVar, WritableByteChannel writableByteChannel) {
        this.a = (byte) 2;
        this.c = j;
        this.b = oqhVar;
        this.d = writableByteChannel;
    }

    public /* synthetic */ o02(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public /* synthetic */ o02(Object obj, String str, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = j;
    }

    public final Object invoke(Object obj) throws IOException {
        byte b = this.a;
        long j = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wth wthVar = (wth) obj3;
                j31 j31Var = (j31) obj2;
                tw7 tw7Var = (tw7) obj;
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        sfb sfbVar = (sfb) ((sw7) tw7Var).a;
                        if (sfbVar != null) {
                            ArrayList arrayList = sfbVar.h;
                            if (arrayList.size() <= 0) {
                                j31Var.invoke((Object) null);
                            } else {
                                long jLongValue = ((Number) arrayList.get(0)).longValue();
                                long j2 = this.c;
                                wthVar.z(j2, jLongValue, new p02(j31Var, wthVar, j2, arrayList, 0, 1));
                            }
                        } else {
                            j31Var.invoke((Object) null);
                        }
                    }
                } else {
                    j31Var.invoke((Object) null);
                }
                break;
            case 1:
                wth wthVar2 = (wth) obj3;
                bo3 bo3Var = (bo3) obj2;
                tw7 tw7Var2 = (tw7) obj;
                if (!(tw7Var2 instanceof rw7)) {
                    if (!(tw7Var2 instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        sfb sfbVar2 = (sfb) ((sw7) tw7Var2).a;
                        if (sfbVar2 != null) {
                            ArrayList arrayList2 = sfbVar2.h;
                            int size = arrayList2.size() - 1;
                            if (size < 0 || size >= arrayList2.size()) {
                                bo3Var.invoke(null);
                            } else {
                                long jLongValue2 = ((Number) arrayList2.get(size)).longValue();
                                long j3 = this.c;
                                wthVar2.z(j3, jLongValue2, new p02(bo3Var, wthVar2, j3, arrayList2, size, -1));
                            }
                        } else {
                            bo3Var.invoke(null);
                        }
                    }
                } else {
                    bo3Var.invoke(null);
                }
                break;
            case 2:
                oqh oqhVar = (oqh) obj3;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                long j4 = j - oqhVar.a;
                if (j4 < byteBuffer.remaining()) {
                    int iLimit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + ((int) j4));
                    while (byteBuffer.hasRemaining()) {
                        writableByteChannel.write(byteBuffer);
                    }
                    byteBuffer.limit(iLimit);
                    oqhVar.a += j4;
                } else {
                    long jWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        jWrite += writableByteChannel.write(byteBuffer);
                    }
                    oqhVar.a += jWrite;
                }
                break;
            case 3:
                cd1 cd1Var = (cd1) obj3;
                rga rgaVar = (paj) obj2;
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                if (((Number) cd1Var.d()).floatValue() > 0.0f) {
                    long jB = u95.b(j, ((Number) cd1Var.d()).floatValue() * 0.26f);
                    if (rgaVar == kfo.i) {
                        mk7.z0(o3cVar, jB, 0L, 0.0f, 126);
                    } else {
                        x7d.f(o3cVar, rgaVar.a(o3cVar.a.e(), o3cVar.getLayoutDirection(), o3cVar), jB);
                    }
                }
                break;
            case 4:
                String str = (String) obj3;
                String str2 = (String) obj2;
                ki0 ki0Var = (ki0) obj;
                ji0 ji0Var = ki0Var.a;
                ji0 ji0Var2 = ki0Var.a;
                ji0Var.p(0, 1, 1L);
                if (str.length() > 0) {
                    ji0Var2.q(1, 1, str);
                }
                if (str2.length() > 0) {
                    ji0Var2.q(2, 1, str2);
                }
                ji0Var2.q(3, 1, ii0.c);
                ji0Var2.p(4, 1, j);
                break;
            case 5:
                spa spaVar = (spa) obj;
                apa apaVar = apa.b;
                spaVar.b = z4o.i0(RequestBuilder.GET);
                ugm.b(spaVar.a, ((weo) obj3).a + "api/v1/market/product/" + l75.f(3, String.valueOf((String) obj2)) + "/" + l75.f(3, String.valueOf(j)) + "/limits");
                jf2 jf2Var = vpa.a;
                g9a g9aVar = spaVar.c;
                g9aVar.i("Authorization", "");
                g9aVar.i("Accept-Language", "");
                break;
            default:
                String str3 = (String) obj2;
                spa spaVar2 = (spa) obj;
                apa apaVar2 = apa.b;
                spaVar2.b = z4o.i0(RequestBuilder.GET);
                ugm.b(spaVar2.a, ((zfo) obj3).a + "q/event_venue");
                ynh.g(spaVar2, "event_id", String.valueOf(j));
                if (str3 != null) {
                    ynh.g(spaVar2, "user_preferred_language", str3);
                }
                break;
        }
        return Unit.a;
    }
}
