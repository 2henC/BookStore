package vn.edu.iuh.fit.backend.enums;

public enum BookStatus {
    ACTIVE,    // Sách hiện có sẵn
    INACTIVE,  // Sách không có sẵn, nhưng vẫn được lưu trữ trong database
    ARCHIVED   // Sách đã được lưu trữ và không còn hiển thị trên hệ thống
}
