package az.et.practice.login_register_app_v1.model;

public class CommonResponseDto<R> {
    private final R data;
    private final int status;

    public CommonResponseDto(R data, int status) {
        this.data = data;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("CommonResponseDto{data=%s, status=%d}", data, status);
    }
}
