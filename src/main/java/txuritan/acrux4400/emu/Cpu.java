package txuritan.acrux4400.emu;

// NOTE: opcode methods were generated from eloraam's instruction table
// instruction table: http://www.eloraam.com/nonwp/redcpu.php
// code that generated this boilerplate: https://play.rust-lang.org/?version=stable&mode=debug&edition=2021&gist=c3db851aed2c8b1674031fc7906256aa
public class Cpu {
    //region 6502
    void x00/*brk*/() {}
    void x01/*ora (ind,x)*/() {}
    void x05/*ora zp*/() {}
    void x06/*asl zp*/() {}
    void x08/*php*/() {}
    void x09/*ora #*/() {}
    void x0A/*asl a*/() {}
    void x0D/*ora abs*/() {}
    void x0E/*asl abs*/() {}
    void x10/*bpl rel*/() {}
    void x11/*ora (ind),y*/() {}
    void x15/*ora zp,x*/() {}
    void x16/*asl zp,x*/() {}
    void x18/*clc*/() {}
    void x19/*ora abs,y*/() {}
    void x1D/*ora abs,x*/() {}
    void x1E/*asl abs,x*/() {}
    void x20/*jsr abs*/() {}
    void x21/*and (ind,x)*/() {}
    void x24/*bit zp*/() {}
    void x25/*and zp*/() {}
    void x26/*rol zp*/() {}
    void x28/*plp*/() {}
    void x29/*and #*/() {}
    void x2A/*rol a*/() {}
    void x2C/*bit abs*/() {}
    void x2D/*and abs*/() {}
    void x2E/*rol abs*/() {}
    void x30/*bmi rel*/() {}
    void x31/*and (ind),y*/() {}
    void x35/*and zp,x*/() {}
    void x36/*rol zp,x*/() {}
    void x38/*sec*/() {}
    void x39/*and abs,y*/() {}
    void x3D/*and abs,x*/() {}
    void x3E/*rol abs,x*/() {}
    void x40/*rti*/() {}
    void x41/*eor (ind,x)*/() {}
    void x45/*eor zp*/() {}
    void x46/*lsr zp*/() {}
    void x48/*pha*/() {}
    void x49/*eor #*/() {}
    void x4A/*lsr a*/() {}
    void x4C/*jmp abs*/() {}
    void x4D/*eor abs*/() {}
    void x4E/*lsr abs*/() {}
    void x50/*bvc rel*/() {}
    void x51/*eor (ind),y*/() {}
    void x55/*eor zp,x*/() {}
    void x56/*lsr zp,x*/() {}
    void x58/*cli*/() {}
    void x59/*eor abs,y*/() {}
    void x5D/*eor abs,x*/() {}
    void x5E/*lsr abs,x*/() {}
    void x60/*rts*/() {}
    void x61/*adc (ind,x)*/() {}
    void x65/*adc zp*/() {}
    void x66/*ror zp*/() {}
    void x68/*pla*/() {}
    void x69/*adc #*/() {}
    void x6A/*ror a*/() {}
    void x6C/*jmp (ind)*/() {}
    void x6D/*adc abs*/() {}
    void x6E/*ror abs*/() {}
    void x70/*bvs rel*/() {}
    void x71/*adc (ind),y*/() {}
    void x75/*adc zp,x*/() {}
    void x76/*ror zp,x*/() {}
    void x78/*sei*/() {}
    void x79/*adc abs,y*/() {}
    void x7D/*adc abs,x*/() {}
    void x7E/*ror abs,x*/() {}
    void x81/*sta (ind,x)*/() {}
    void x84/*sty zp*/() {}
    void x85/*sta zp*/() {}
    void x86/*stx zp*/() {}
    void x88/*dey*/() {}
    void x8A/*txa*/() {}
    void x8C/*sty abs*/() {}
    void x8D/*sta abs*/() {}
    void x8E/*stx abs*/() {}
    void x90/*bcc rel*/() {}
    void x91/*sta (ind),y*/() {}
    void x94/*sty zp,x*/() {}
    void x95/*sta zp,x*/() {}
    void x96/*stx zp,y*/() {}
    void x98/*tya*/() {}
    void x99/*sta abs,y*/() {}
    void x9A/*txs*/() {}
    void x9D/*sta abs,x*/() {}
    void xA0/*ldy #*/() {}
    void xA1/*lda (ind,x)*/() {}
    void xA2/*ldx #*/() {}
    void xA4/*ldy zp*/() {}
    void xA5/*lda zp*/() {}
    void xA6/*ldx zp*/() {}
    void xA8/*tay*/() {}
    void xA9/*lda #*/() {}
    void xAA/*tax*/() {}
    void xAC/*ldy abs*/() {}
    void xAD/*lda abs*/() {}
    void xAE/*ldx abs*/() {}
    void xB0/*bcs rel*/() {}
    void xB1/*lda (ind),y*/() {}
    void xB4/*ldy zp,x*/() {}
    void xB5/*lda zp,x*/() {}
    void xB6/*ldx zp,y*/() {}
    void xB8/*clv*/() {}
    void xB9/*lda abs,y*/() {}
    void xBA/*tsx*/() {}
    void xBC/*ldy abs,x*/() {}
    void xBD/*lda abs,x*/() {}
    void xBE/*ldx abs,y*/() {}
    void xC0/*cpy #*/() {}
    void xC1/*cmp (ind,x)*/() {}
    void xC4/*cpy zp*/() {}
    void xC5/*cmp zp*/() {}
    void xC6/*dec zp*/() {}
    void xC8/*iny*/() {}
    void xC9/*cmp #*/() {}
    void xCA/*dex*/() {}
    void xCC/*cpy abs*/() {}
    void xCD/*cmp abs*/() {}
    void xCE/*dec abs*/() {}
    void xD0/*bne rel*/() {}
    void xD1/*cmp (ind),y*/() {}
    void xD5/*cmp zp,x*/() {}
    void xD6/*dec zp,x*/() {}
    void xD8/*cld*/() {}
    void xD9/*cmp abs,y*/() {}
    void xDD/*cmp abs,x*/() {}
    void xDE/*dec abs,x*/() {}
    void xE0/*cpx #*/() {}
    void xE1/*sbc (ind,x)*/() {}
    void xE4/*cpx zp*/() {}
    void xE5/*sbc zp*/() {}
    void xE6/*inc zp*/() {}
    void xE8/*inx*/() {}
    void xE9/*sbc #*/() {}
    void xEA/*nop*/() {}
    void xEC/*cpx abs*/() {}
    void xED/*sbc abs*/() {}
    void xEE/*inc abs*/() {}
    void xF0/*beq rel*/() {}
    void xF1/*sbc (ind),y*/() {}
    void xF5/*sbc zp,x*/() {}
    void xF6/*inc zp,x*/() {}
    void xF8/*sed*/() {}
    void xF9/*sbc abs,y*/() {}
    void xFD/*sbc abs,x*/() {}
    void xFE/*inc abs,x*/() {}
    //endregion

    //region 65C02
    void x04/*tsb zp*/() {}
    void x0C/*tsb abs*/() {}
    void x12/*ora (ind)*/() {}
    void x14/*trb zp*/() {}
    void x1A/*inc a*/() {}
    void x1C/*trb abs*/() {}
    void x32/*and (ind)*/() {}
    void x34/*bit zp,x*/() {}
    void x3A/*dec a*/() {}
    void x3C/*bit abs,x*/() {}
    void x52/*eor (ind)*/() {}
    void x5A/*phy*/() {}
    void x64/*stz zp*/() {}
    void x72/*adc (ind)*/() {}
    void x74/*stz zp,x*/() {}
    void x7A/*ply*/() {}
    void x7C/*jmp (abs,x)*/() {}
    void x80/*bra rel*/() {}
    void x89/*bit #*/() {}
    void x92/*sta (ind)*/() {}
    void x9C/*stz abs*/() {}
    void x9E/*stz abs,x*/() {}
    void xB2/*lda (ind)*/() {}
    void xCB/*wai*/() {}
    void xD2/*cmp (ind)*/() {}
    void xDA/*phx*/() {}
    void xDB/*stp*/() {}
    void xF2/*sbc (ind)*/() {}
    void xFA/*plx*/() {}
    //endregion

    //region 65C816
    void x03/*ora r,s*/() {}
    void x13/*ora (r,s),y*/() {}
    void x23/*and r,s*/() {}
    void x33/*and (r,s),y*/() {}
    void x43/*eor r,s*/() {}
    void x53/*eor (r,s),y*/() {}
    void x62/*per rel*/() {}
    void x63/*adc r,s*/() {}
    void x73/*adc (r,s),y*/() {}
    void x83/*sta r,s*/() {}
    void x93/*sta (r,s),y*/() {}
    void x9B/*txy*/() {}
    void xA3/*lda r,s*/() {}
    void xB3/*lda (r,s),y*/() {}
    void xBB/*tyx*/() {}
    void xC2/*rep #*/() {}
    void xC3/*cmp r,s*/() {}
    void xD3/*cmp (r,s),y*/() {}
    void xD4/*pei (zp)*/() {}
    void xE2/*sep #*/() {}
    void xE3/*sbc r,s*/() {}
    void xEB/*xba*/() {}
    void xF3/*sbc (r,s),y*/() {}
    void xF4/*pea abs*/() {}
    void xFB/*xce*/() {}
    void xFC/*jsr (abs,x)*/() {}
    //endregion

    //region 65EL02
    void x02/*nxt*/() {}
    void x07/*ora r,r*/() {}
    void x0B/*rhi*/() {}
    void x0F/*mul zp*/() {}
    void x17/*ora (r,r),y*/() {}
    void x1B/*rhx*/() {}
    void x1F/*mul zp,x*/() {}
    void x22/*ent*/() {}
    void x27/*and r,r*/() {}
    void x2B/*rli*/() {}
    void x2F/*mul abs*/() {}
    void x37/*and (r,r),y*/() {}
    void x3B/*rlx*/() {}
    void x3F/*mul abs,x*/() {}
    void x42/*nxa*/() {}
    void x44/*rea abs*/() {}
    void x47/*eor r,r*/() {}
    void x4B/*rha*/() {}
    void x4F/*div zp*/() {}
    void x54/*rei (zp)*/() {}
    void x57/*eor (r,r),y*/() {}
    void x5B/*rhy*/() {}
    void x5C/*txi*/() {}
    void x5F/*div zp,x*/() {}
    void x67/*adc r,r*/() {}
    void x6B/*rla*/() {}
    void x6F/*div abs*/() {}
    void x77/*adc (r,r),y*/() {}
    void x7B/*rly*/() {}
    void x7F/*div abs,x*/() {}
    void x82/*rer rel*/() {}
    void x87/*sta r,r*/() {}
    void x8B/*txr*/() {}
    void x8F/*zea*/() {}
    void x97/*sta (r,r),y*/() {}
    void x9F/*sea*/() {}
    void xA7/*lda r,r*/() {}
    void xAB/*trx*/() {}
    void xAF/*tda*/() {}
    void xB7/*lda (r,r),y*/() {}
    void xBF/*tad*/() {}
    void xC7/*cmp r,r*/() {}
    void xCF/*pld*/() {}
    void xD7/*cmp (r,r),y*/() {}
    void xDC/*tix*/() {}
    void xDF/*phd*/() {}
    void xE7/*sbc r,r*/() {}
    void xEF/*mmu*/() {}
    void xF7/*sbc (r,r),y*/() {}
    //endregion

    // dummy noop for the switch statement
    void xff() {}

    @SuppressWarnings("ConstantConditions")
    void next() {
        int opcode = 0;

        switch (opcode) {
            //region 6502
            case 0x00 -> x00();
            case 0x01 -> x01();
            case 0x05 -> x05();
            case 0x06 -> x06();
            case 0x08 -> x08();
            case 0x09 -> x09();
            case 0x0A -> x0A();
            case 0x0D -> x0D();
            case 0x0E -> x0E();
            case 0x10 -> x10();
            case 0x11 -> x11();
            case 0x15 -> x15();
            case 0x16 -> x16();
            case 0x18 -> x18();
            case 0x19 -> x19();
            case 0x1D -> x1D();
            case 0x1E -> x1E();
            case 0x20 -> x20();
            case 0x21 -> x21();
            case 0x24 -> x24();
            case 0x25 -> x25();
            case 0x26 -> x26();
            case 0x28 -> x28();
            case 0x29 -> x29();
            case 0x2A -> x2A();
            case 0x2C -> x2C();
            case 0x2D -> x2D();
            case 0x2E -> x2E();
            case 0x30 -> x30();
            case 0x31 -> x31();
            case 0x35 -> x35();
            case 0x36 -> x36();
            case 0x38 -> x38();
            case 0x39 -> x39();
            case 0x3D -> x3D();
            case 0x3E -> x3E();
            case 0x40 -> x40();
            case 0x41 -> x41();
            case 0x45 -> x45();
            case 0x46 -> x46();
            case 0x48 -> x48();
            case 0x49 -> x49();
            case 0x4A -> x4A();
            case 0x4C -> x4C();
            case 0x4D -> x4D();
            case 0x4E -> x4E();
            case 0x50 -> x50();
            case 0x51 -> x51();
            case 0x55 -> x55();
            case 0x56 -> x56();
            case 0x58 -> x58();
            case 0x59 -> x59();
            case 0x5D -> x5D();
            case 0x5E -> x5E();
            case 0x60 -> x60();
            case 0x61 -> x61();
            case 0x65 -> x65();
            case 0x66 -> x66();
            case 0x68 -> x68();
            case 0x69 -> x69();
            case 0x6A -> x6A();
            case 0x6C -> x6C();
            case 0x6D -> x6D();
            case 0x6E -> x6E();
            case 0x70 -> x70();
            case 0x71 -> x71();
            case 0x75 -> x75();
            case 0x76 -> x76();
            case 0x78 -> x78();
            case 0x79 -> x79();
            case 0x7D -> x7D();
            case 0x7E -> x7E();
            case 0x81 -> x81();
            case 0x84 -> x84();
            case 0x85 -> x85();
            case 0x86 -> x86();
            case 0x88 -> x88();
            case 0x8A -> x8A();
            case 0x8C -> x8C();
            case 0x8D -> x8D();
            case 0x8E -> x8E();
            case 0x90 -> x90();
            case 0x91 -> x91();
            case 0x94 -> x94();
            case 0x95 -> x95();
            case 0x96 -> x96();
            case 0x98 -> x98();
            case 0x99 -> x99();
            case 0x9A -> x9A();
            case 0x9D -> x9D();
            case 0xA0 -> xA0();
            case 0xA1 -> xA1();
            case 0xA2 -> xA2();
            case 0xA4 -> xA4();
            case 0xA5 -> xA5();
            case 0xA6 -> xA6();
            case 0xA8 -> xA8();
            case 0xA9 -> xA9();
            case 0xAA -> xAA();
            case 0xAC -> xAC();
            case 0xAD -> xAD();
            case 0xAE -> xAE();
            case 0xB0 -> xB0();
            case 0xB1 -> xB1();
            case 0xB4 -> xB4();
            case 0xB5 -> xB5();
            case 0xB6 -> xB6();
            case 0xB8 -> xB8();
            case 0xB9 -> xB9();
            case 0xBA -> xBA();
            case 0xBC -> xBC();
            case 0xBD -> xBD();
            case 0xBE -> xBE();
            case 0xC0 -> xC0();
            case 0xC1 -> xC1();
            case 0xC4 -> xC4();
            case 0xC5 -> xC5();
            case 0xC6 -> xC6();
            case 0xC8 -> xC8();
            case 0xC9 -> xC9();
            case 0xCA -> xCA();
            case 0xCC -> xCC();
            case 0xCD -> xCD();
            case 0xCE -> xCE();
            case 0xD0 -> xD0();
            case 0xD1 -> xD1();
            case 0xD5 -> xD5();
            case 0xD6 -> xD6();
            case 0xD8 -> xD8();
            case 0xD9 -> xD9();
            case 0xDD -> xDD();
            case 0xDE -> xDE();
            case 0xE0 -> xE0();
            case 0xE1 -> xE1();
            case 0xE4 -> xE4();
            case 0xE5 -> xE5();
            case 0xE6 -> xE6();
            case 0xE8 -> xE8();
            case 0xE9 -> xE9();
            case 0xEA -> xEA();
            case 0xEC -> xEC();
            case 0xED -> xED();
            case 0xEE -> xEE();
            case 0xF0 -> xF0();
            case 0xF1 -> xF1();
            case 0xF5 -> xF5();
            case 0xF6 -> xF6();
            case 0xF8 -> xF8();
            case 0xF9 -> xF9();
            case 0xFD -> xFD();
            case 0xFE -> xFE();
            //endregion

            //region 65C02
            case 0x04 -> x04();
            case 0x0C -> x0C();
            case 0x12 -> x12();
            case 0x14 -> x14();
            case 0x1A -> x1A();
            case 0x1C -> x1C();
            case 0x32 -> x32();
            case 0x34 -> x34();
            case 0x3A -> x3A();
            case 0x3C -> x3C();
            case 0x52 -> x52();
            case 0x5A -> x5A();
            case 0x64 -> x64();
            case 0x72 -> x72();
            case 0x74 -> x74();
            case 0x7A -> x7A();
            case 0x7C -> x7C();
            case 0x80 -> x80();
            case 0x89 -> x89();
            case 0x92 -> x92();
            case 0x9C -> x9C();
            case 0x9E -> x9E();
            case 0xB2 -> xB2();
            case 0xCB -> xCB();
            case 0xD2 -> xD2();
            case 0xDA -> xDA();
            case 0xDB -> xDB();
            case 0xF2 -> xF2();
            case 0xFA -> xFA();
            //endregion

            //region 65C816
            case 0x03 -> x03();
            case 0x13 -> x13();
            case 0x23 -> x23();
            case 0x33 -> x33();
            case 0x43 -> x43();
            case 0x53 -> x53();
            case 0x62 -> x62();
            case 0x63 -> x63();
            case 0x73 -> x73();
            case 0x83 -> x83();
            case 0x93 -> x93();
            case 0x9B -> x9B();
            case 0xA3 -> xA3();
            case 0xB3 -> xB3();
            case 0xBB -> xBB();
            case 0xC2 -> xC2();
            case 0xC3 -> xC3();
            case 0xD3 -> xD3();
            case 0xD4 -> xD4();
            case 0xE2 -> xE2();
            case 0xE3 -> xE3();
            case 0xEB -> xEB();
            case 0xF3 -> xF3();
            case 0xF4 -> xF4();
            case 0xFB -> xFB();
            case 0xFC -> xFC();
            //endregion

            //region 65EL02
            case 0x02 -> x02();
            case 0x07 -> x07();
            case 0x0B -> x0B();
            case 0x0F -> x0F();
            case 0x17 -> x17();
            case 0x1B -> x1B();
            case 0x1F -> x1F();
            case 0x22 -> x22();
            case 0x27 -> x27();
            case 0x2B -> x2B();
            case 0x2F -> x2F();
            case 0x37 -> x37();
            case 0x3B -> x3B();
            case 0x3F -> x3F();
            case 0x42 -> x42();
            case 0x44 -> x44();
            case 0x47 -> x47();
            case 0x4B -> x4B();
            case 0x4F -> x4F();
            case 0x54 -> x54();
            case 0x57 -> x57();
            case 0x5B -> x5B();
            case 0x5C -> x5C();
            case 0x5F -> x5F();
            case 0x67 -> x67();
            case 0x6B -> x6B();
            case 0x6F -> x6F();
            case 0x77 -> x77();
            case 0x7B -> x7B();
            case 0x7F -> x7F();
            case 0x82 -> x82();
            case 0x87 -> x87();
            case 0x8B -> x8B();
            case 0x8F -> x8F();
            case 0x97 -> x97();
            case 0x9F -> x9F();
            case 0xA7 -> xA7();
            case 0xAB -> xAB();
            case 0xAF -> xAF();
            case 0xB7 -> xB7();
            case 0xBF -> xBF();
            case 0xC7 -> xC7();
            case 0xCF -> xCF();
            case 0xD7 -> xD7();
            case 0xDC -> xDC();
            case 0xDF -> xDF();
            case 0xE7 -> xE7();
            case 0xEF -> xEF();
            case 0xF7 -> xF7();
            //endregion

            default -> xff();
        }
    }
}
