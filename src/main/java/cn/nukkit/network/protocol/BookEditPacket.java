package cn.nukkit.network.protocol;

public class BookEditPacket extends DataPacket {
    
    public static final int TYPE_REPLACE_PAGE = 0;
    public static final int TYPE_ADD_PAGE = 1;
    public static final int TYPE_DELETE_PAGE = 2;
    public static final int TYPE_SWAP_PAGES = 3;
    public static final int TYPE_SIGN_BOOK = 4;
    
    public int type;
    public int inventorySlot;
    public int pageNumber;
    public int secondaryPageNumber;
    
    public String content1;
    public String content2;
    
    public String title;
    public String author;

    @Override
    public byte pid() {
        return ProtocolInfo.BOOK_EDIT_PACKET;
    }

    @Override
    public void decode() {
        this.type = this.getByte();
        this.inventorySlot = this.getByte();
    }

    @Override
    public void encode() {
        this.reset();
        this.putByte((byte) this.type);
        this.putByte((byte) this.inventorySlot);
    }
    
}
