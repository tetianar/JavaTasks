package NoteBook.Model.Entity;

import NoteBook.Controller.InputRegForm;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class NoteBookItem {
    private Name name;
    private String nickname;
    private String comment;
    private String group;
    private String homeNumber;
    private String mobileNumber;
    private String mobileNumber2;
    private String email;
    private String skype;
    private String index;
    private Address address;
    private String createData;
    private String modifyData;

    public NoteBookItem() {
        Name name = new Name(InputRegForm.getName(),InputRegForm.getSurname(),InputRegForm.getPatronymic());
        this.name = name;
        Address adress = new Address (InputRegForm.getIndex(),InputRegForm.getCity(), InputRegForm.getStreet(),InputRegForm.getBuilding(),
                InputRegForm.getApartment());
        this.address = adress;
        this.nickname = InputRegForm.getNickname();
        this.comment = InputRegForm.getComment();
        this.group = InputRegForm.getGroup();
        this.homeNumber = InputRegForm.getHomeNumber();
        this.mobileNumber = InputRegForm.getMobileNumber();
        this.mobileNumber2 = InputRegForm.getMobileNumber2();
        this.email = InputRegForm.getEmail();
        this.skype = InputRegForm.getSkype();
        this.index = InputRegForm.getIndex();
        this.createData = InputRegForm.getCreateData();
        this.modifyData = InputRegForm.getModifyData();

    }


    @Override
    public String toString() {
        return "NoteBookItem{" +
                "name=" + name +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group='" + group + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", mobileNumber2='" + mobileNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", index='" + index + '\'' +
                ", address=" + address +
                ", createData='" + createData + '\'' +
                ", modifyData='" + modifyData + '\'' +
                '}';
    }
}
