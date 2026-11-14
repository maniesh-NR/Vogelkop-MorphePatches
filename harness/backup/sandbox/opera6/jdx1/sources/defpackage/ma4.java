package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ma4 implements ge4 {
    public final String a;
    public final CameraCharacteristics b;
    public final fb4 c;
    public final Set d;
    public final ArrayMap e = new ArrayMap();
    public final ArrayMap f = new ArrayMap();
    public final l4c g;
    public final l4c h;
    public final l4c i;

    public ma4(String str, CameraCharacteristics cameraCharacteristics, fb4 fb4Var, n08 n08Var, Set set) {
        this.a = str;
        this.b = cameraCharacteristics;
        this.c = fb4Var;
        this.d = set;
        f7c f7cVar = f7c.b;
        final byte b = 0;
        this.g = z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ma4 ma4Var = this.b;
                switch (b2) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b2 = 1;
        z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b3 = 2;
        z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b4 = 3;
        z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b4;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b5 = 4;
        this.h = z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b5;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b6 = 5;
        z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b6;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b7 = 6;
        z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b7;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
        final byte b8 = 7;
        this.i = z4c.a(f7cVar, new Function0(this) { // from class: la4
            public final /* synthetic */ ma4 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b8;
                ma4 ma4Var = this.b;
                switch (b22) {
                    case 0:
                        String str2 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) sd4.b(str2)) + "#supportedExtensions");
                                Set setN0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.n0(m41.v(ma4Var.c.d(str2))) : v08.a;
                                Trace.endSection();
                                return setN0;
                            } finally {
                            }
                        } catch (AssertionError unused) {
                            sd4.b(str2);
                            return v08.a;
                        }
                    case 1:
                        String str3 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str3)) + "#keys");
                                l08 keys = ma4Var.b.getKeys();
                                if (keys == null) {
                                    keys = l08.a;
                                }
                                Set setN02 = CollectionsKt.n0((Iterable) keys);
                                Trace.endSection();
                                return setN02;
                            } finally {
                            }
                        } catch (AssertionError unused2) {
                            sd4.b(str3);
                            return v08.a;
                        }
                    case 2:
                        String str4 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str4)) + "#availableCaptureRequestKeys");
                                l08 availableCaptureRequestKeys = ma4Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = l08.a;
                                }
                                Set setN03 = CollectionsKt.n0((Iterable) availableCaptureRequestKeys);
                                Trace.endSection();
                                return setN03;
                            } finally {
                            }
                        } catch (AssertionError unused3) {
                            sd4.b(str4);
                            return v08.a;
                        }
                    case 3:
                        String str5 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str5)) + "#availableCaptureResultKeys");
                                l08 availableCaptureResultKeys = ma4Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = l08.a;
                                }
                                Set setN04 = CollectionsKt.n0((Iterable) availableCaptureResultKeys);
                                Trace.endSection();
                                return setN04;
                            } finally {
                            }
                        } catch (AssertionError unused4) {
                            sd4.b(str5);
                            return v08.a;
                        }
                    case 4:
                        String str6 = ma4Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) sd4.b(str6)) + "#physicalCameraIds");
                                v08 physicalCameraIds = ma4Var.b.getPhysicalCameraIds();
                                sd4.b(str6);
                                Objects.toString(physicalCameraIds);
                                if (physicalCameraIds == null) {
                                    physicalCameraIds = v08.a;
                                }
                                Set<String> set2 = (Iterable) physicalCameraIds;
                                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                                for (String str7 : set2) {
                                    sd4.a(str7);
                                    arrayList.add(new sd4(str7));
                                }
                                Set setN05 = CollectionsKt.n0(arrayList);
                                Trace.endSection();
                                return setN05;
                            } finally {
                            }
                        } catch (AssertionError unused5) {
                            sd4.b(str6);
                            return v08.a;
                        } catch (NullPointerException unused6) {
                            sd4.b(str6);
                            return v08.a;
                        }
                    case 5:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availablePhysicalCameraRequestKeys");
                                l08 availablePhysicalCameraRequestKeys = ma4Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = l08.a;
                                }
                                Set setN06 = CollectionsKt.n0((Iterable) availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return setN06;
                            } finally {
                            }
                        } catch (AssertionError unused7) {
                            return v08.a;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return v08.a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#getAvailableSessionCharacteristicsKeys");
                                l08 l08VarD = kg1.d(ma4Var.b);
                                if (l08VarD == null) {
                                    l08VarD = l08.a;
                                }
                                Set setN07 = CollectionsKt.n0((Iterable) l08VarD);
                                Trace.endSection();
                                return setN07;
                            } finally {
                            }
                        } catch (AssertionError unused8) {
                            return v08.a;
                        }
                    default:
                        try {
                            try {
                                Trace.beginSection("Camera-" + ma4Var.a + "#availableSessionKeys");
                                l08 availableSessionKeys = ma4Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = l08.a;
                                }
                                Set setN08 = CollectionsKt.n0((Iterable) availableSessionKeys);
                                Trace.endSection();
                                return setN08;
                            } finally {
                            }
                        } catch (AssertionError unused9) {
                            return v08.a;
                        }
                }
            }
        });
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CameraCharacteristics.class))) {
            return this.b;
        }
        return null;
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        if (this.d.contains(key)) {
            try {
                return this.b.get(key);
            } catch (AssertionError unused) {
                hai.g(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.e) {
            obj = this.e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.b.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.e) {
                this.e.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            hai.g(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
            return null;
        }
    }
}
