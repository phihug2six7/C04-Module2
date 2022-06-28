package ss17_binaryfile_serialization.bai1.service.ipml;

import ss17_binaryfile_serialization.bai1.model.ProductManagement;
import ss17_binaryfile_serialization.bai1.service.IService;
import ss17_binaryfile_serialization.bai1.ụntil.ReadAndWriter;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IService {
        final String PATH_FILE_PRODUCT="src/ss17_binaryfile_serialization/data/abcd.dat";
        Scanner scanner=new Scanner(System.in);
    @Override
    public void them() {
        List<ProductManagement> list= ReadAndWriter.readObjectToListManagement(PATH_FILE_PRODUCT);
        System.out.println("Nhập mã sản phẩm");
        String maSP=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String tenSP=scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String hangSX=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        String giaSP=scanner.nextLine();
        list.add(new ProductManagement(maSP,tenSP,hangSX,giaSP));
        ReadAndWriter.writeObjectListProductManagement(list,PATH_FILE_PRODUCT);
    }

    @Override
    public void hienThi() {
        List<ProductManagement> list= ReadAndWriter.readObjectToListManagement(PATH_FILE_PRODUCT);
        for (ProductManagement productManagement:list) {
            System.out.println(productManagement);
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập mã để tìm kiếm");
        String maSP=scanner.nextLine();
        List<ProductManagement> list= ReadAndWriter.readObjectToListManagement(PATH_FILE_PRODUCT);
        for (int i = 0; i <list.size() ; i++) {
            if (maSP.equalsIgnoreCase(list.get(i).getMaSP())){
                System.out.println(list.get(i));
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm");
    }

    @Override
    public void troVe() {

    }
}
