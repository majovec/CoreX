package cn.nukkit.network.protocol;

public class ShowProfilePacket extends DataPacket {

    public String string1;

    @Override
    public byte pid() {
        return ProtocolInfo.SHOW_PROFILE_PACKET;
    }

    @Override
    public void decode() {
        this.string1 = this.getString();
    }

    @Override
    public void encode() {
        this.putString(this.string1);
    }

}
