#pragma version(1)
#pragma rs java_package_name(android.renderscript.cts)

struct mad_input_f32_3 {
    float3 x;
    float3 y;
    float3 z;
};

void root(const struct mad_input_f32_3 *param, float3 *out) {
    *out = mad(param->x, param->y, param->z);
}